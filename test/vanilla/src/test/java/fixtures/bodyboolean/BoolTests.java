package fixtures.bodyboolean;

import com.fasterxml.jackson.core.JsonParseException;
import com.microsoft.rest.v2.http.HttpPipeline;
import com.microsoft.rest.v2.policy.DecodingPolicyFactory;
import fixtures.bodyboolean.implementation.AutoRestBoolTestServiceImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.fail;

public class BoolTests {
    private static AutoRestBoolTestService client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestBoolTestServiceImpl(HttpPipeline.build(new DecodingPolicyFactory()));
    }

    @Test
    public void getNull() throws Exception {
        try {
            boolean b = client.bools().getNull();
            fail();
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void getInvalid() throws Exception {
        try {
            client.bools().getInvalid();
            Assert.assertTrue(false);
        } catch (Exception exception) {
            // expected
            Assert.assertEquals(JsonParseException.class, exception.getCause().getClass());
        }
    }

    @Test
    public void getTrue() throws Exception {
        boolean result = client.bools().getTrue();
        Assert.assertTrue(result);
    }

    @Test
    public void getFalse() throws Exception {
        boolean result = client.bools().getFalse();
        Assert.assertFalse(result);
    }

    @Test
    public void putTrue() throws Exception {
        client.bools().putTrue(true);
    }

    @Test
    public void putFalse() throws Exception {
        client.bools().putFalse(false);
    }
}
