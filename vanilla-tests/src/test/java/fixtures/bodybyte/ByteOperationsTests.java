package fixtures.bodybyte;

import fixtures.httpinfrastructure.models.ErrorException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ByteOperationsTests {
    private static AutoRestSwaggerBATByteService client;

    @BeforeAll
    public static void setup() {
        client = new AutoRestSwaggerBATByteServiceBuilder().buildClient();
    }

    @Test
    public void getNull() {
        byte[] result = client.getByteOperations().getNull();
        assertTrue(result == null || result.length == 0);
    }

    @Test
    public void getEmpty() {
        byte[] result = client.getByteOperations().getEmpty();
        assertArrayEquals("\"\"".getBytes(StandardCharsets.UTF_8), result);
    }

    @Test
    public void getNonAscii() {
        byte[] result = client.getByteOperations().getNonAscii();
        // Previously, byte[] response bodies were automatically base64 decoded by the runtime.
        // This conflicts with the octet-stream  (e.g. file/media download) use case,
        // so we're now passing the byte[] through as-is.
        byte[] expected = new byte[] { 34, 47, 47, 55, 57, 47, 80, 118, 54, 43, 102, 106, 51, 57, 103, 61, 61, 34 };
        assertArrayEquals(expected, result);
    }

    @Test
    public void putNonAscii() {
        byte[] body = new byte[] {
                (byte) 255, (byte) 254, (byte) 253, (byte) 252, (byte) 251,
                (byte) 250, (byte) 249, (byte) 248, (byte) 247, (byte) 246
        };

        client.getByteOperations().putNonAscii(body);
    }

    @Test
    public void getInvalid() {
        try {
            byte[] result = client.getByteOperations().getInvalid();
            assertArrayEquals("\"::::SWAGGER::::\"".getBytes(StandardCharsets.UTF_8), result);
        } catch (ErrorException e) {
            e.printStackTrace();
        }
    }
}
