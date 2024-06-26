package fixtures.mediatypes;

import fixtures.mediatypes.models.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class MediaTypesTests {
    private static MediaTypesClient client;

    @BeforeAll
    public static void setup() {
        client = new MediaTypesClientBuilder().buildClient();
    }

    @Test
    public void analyzeWithJson() {
        client.analyzeBody("source");
    }

    @Test
    public void analyzeWithPdf() {
        client.analyzeBody(ContentType.APPLICATION_PDF,
            Flux.just(ByteBuffer.wrap("PDF".getBytes(StandardCharsets.UTF_8))), 3L);
    }
}
