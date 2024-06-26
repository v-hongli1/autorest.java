// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package fixtures.complexxmltag;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import fixtures.complexxmltag.models.BlobName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComplexXmlTagTests {
    @Test
    public void xmlPropertyIsProperlyAnnotated() throws NoSuchFieldException {
        Field field = BlobName.class.getDeclaredField("content");
        assertTrue(field.isAnnotationPresent(JacksonXmlText.class),
            "Expected 'content' field to be annotated with 'JacksonXmlText' but it wasn't.");
    }
}
