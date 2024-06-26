package fixtures.custombaseuri;

import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.FixedDelay;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.TimeoutPolicy;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class CustomBaseUriTests {
    private static AutoRestParameterizedHostTestClientBuilder clientBuilder;

    @BeforeAll
    public static void setup() {
        clientBuilder = new AutoRestParameterizedHostTestClientBuilder().pipeline(
            new HttpPipelineBuilder().policies(new RetryPolicy(new FixedDelay(3, Duration.ZERO))).build());
    }

    // Positive test case
    @Test
    public void getEmptyWithValidCustomUri() {
        clientBuilder.host("host:3000");
        clientBuilder.buildClient().getPaths().getEmpty("local");
    }

    @Test
    public void getEmptyWithInvalidCustomUriAccountName() {
        assertThrows(RuntimeException.class, () -> clientBuilder.buildClient().getPaths().getEmpty("bad"));
    }

    @Test
    public void getEmptyWithInvalidCustomUriHostName() {
        try {
            clientBuilder.host("badhost");
            assertThrows(RuntimeException.class, () -> clientBuilder.buildClient().getPaths().getEmpty("local"));
        } finally {
            clientBuilder.host("host:3000");
        }
    }

    @Test
    public void getEmptyWithEmptyCustomUriAccountName() {
        assertThrows(IllegalArgumentException.class, () -> clientBuilder.buildClient().getPaths().getEmpty(null));
    }

    @Test
    public void getGoodBadGood() {
        // Short repro for a Windows-specific error where failing to open
        // a connection to badhost would cause the connection
        // to localhost:3000 to be closed.
        // For now, we're working around it by retrying.
        try {
            clientBuilder.host("host:3000").buildClient().getPaths().getEmpty("local");
        } catch (Exception e) {
            fail(e.getMessage());
        }
        try {
            clientBuilder.host("badhost").buildClient().getPaths().getEmpty("local");
            fail();
        } catch (Exception ignored) {
        }
        try {
            clientBuilder.host("host:3000").buildClient().getPaths().getEmpty("local");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void getEmptyMultipleThreads() throws Exception {
        CountDownLatch latch = new CountDownLatch(2);
        AutoRestParameterizedHostTestClientBuilder client1 = new AutoRestParameterizedHostTestClientBuilder().pipeline(
            new HttpPipelineBuilder().policies(new TimeoutPolicy(Duration.ofSeconds(1))).build());
        client1.host("host:3000");
        Thread t1 = new Thread(() -> {
            try {
                client1.buildClient().getPaths().getEmpty("badlocal");
                fail();
            } catch (RuntimeException e) {
                latch.countDown();
            } catch (Exception e) {
                fail();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                client1.buildClient().getPaths().getEmpty("local");
                latch.countDown();
            } catch (Exception ex) {
                fail();
            }
        });
        t1.start();
        t2.start();
        assertTrue(latch.await(15, TimeUnit.SECONDS));
    }
}
