package fixtures.bodycomplex;

import fixtures.bodycomplex.models.Fish;
import fixtures.bodycomplex.models.GoblinSharkColor;
import fixtures.bodycomplex.models.Goblinshark;
import fixtures.bodycomplex.models.Salmon;
import fixtures.bodycomplex.models.Sawshark;
import fixtures.bodycomplex.models.Shark;
import fixtures.bodycomplex.models.SmartSalmon;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PolymorphismTests {
    private static AutoRestComplexTestService client;

    @BeforeAll
    public static void setup() {
        client = new AutoRestComplexTestServiceBuilder().buildClient();
    }

    @Test
    public void getValid() {
        Fish result = client.getPolymorphisms().getValid();
        assertEquals(Salmon.class, result.getClass());
        Salmon salmon = (Salmon) result;
        assertEquals("alaska", salmon.getLocation());
        assertEquals(1.0, salmon.getLength(), 0f);
        assertEquals(3, salmon.getSiblings().size());
        assertEquals(Shark.class, salmon.getSiblings().get(0).getClass());
        Shark sib1 = (Shark) (salmon.getSiblings().get(0));
        assertEquals(OffsetDateTime.of(2012, 1, 5, 1, 0, 0, 0, ZoneOffset.UTC), sib1.getBirthday());
        assertEquals(Sawshark.class, salmon.getSiblings().get(1).getClass());
        Sawshark sib2 = (Sawshark) (salmon.getSiblings().get(1));
        assertArrayEquals(new byte[]{(byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 254}, sib2.getPicture());
        Goblinshark sib3 = (Goblinshark) (salmon.getSiblings().get(2));
        assertEquals(1, sib3.getAge().intValue());
        assertEquals(5, sib3.getJawsize().intValue());
    }

    @Test
    public void putValid() {
        Salmon body = new Salmon(1.0f);
        body.setLocation("alaska");
        body.setIswild(true);
        body.setSpecies("king");
        body.setSiblings(new ArrayList<>());

        Shark sib1 = new Shark(20.0f, OffsetDateTime.of(2012, 1, 5, 1, 0, 0, 0, ZoneOffset.UTC));
        sib1.setAge(6);
        sib1.setSpecies("predator");
        body.getSiblings().add(sib1);

        Sawshark sib2 = new Sawshark(10.0f, OffsetDateTime.of(1900, 1, 5, 1, 0, 0, 0, ZoneOffset.UTC));
        sib2.setAge(105);
        sib2.setPicture(new byte[] {(byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 254});
        sib2.setSpecies("dangerous");
        body.getSiblings().add(sib2);

        Goblinshark sib3 = new Goblinshark(30.0f, OffsetDateTime.of(2015, 8, 8, 0, 0, 0, 0, ZoneOffset.UTC));
        sib3.setAge(1);
        sib3.setSpecies("scary");
        sib3.setJawsize(5);
        sib3.setColor(GoblinSharkColor.fromString("pinkish-gray"));
        body.getSiblings().add(sib3);

        client.getPolymorphisms().putValidWithResponseAsync(body).block();
    }

    @Test
    public void putValidMissingRequired() {
        Salmon body = new Salmon(1.0f);
        body.setLocation("alaska");
        body.setIswild(true);
        body.setSpecies("king");
        body.setSiblings(new ArrayList<>());

        Shark sib1 = new Shark(20.0f, OffsetDateTime.of(2012, 1, 5, 1, 0, 0, 0, ZoneOffset.UTC));
        sib1.setAge(6);
        sib1.setSpecies("predator");
        body.getSiblings().add(sib1);

        Sawshark sib2 = new Sawshark(10.0f, null);
        sib2.setAge(105);
        sib2.setPicture(new byte[] {(byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 254});
        sib2.setSpecies("dangerous");
        body.getSiblings().add(sib2);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
            () -> client.getPolymorphisms().putValidMissingRequiredWithResponseAsync(body).block());
        assertTrue(ex.getMessage().contains("Missing required property birthday in model Shark"));
    }


    @Test
    public void getComplicated() {
        Salmon result = client.getPolymorphisms().getComplicated();
        assertEquals(SmartSalmon.class, result.getClass());
        SmartSalmon salmon = (SmartSalmon) result;
        assertEquals("alaska", salmon.getLocation());
        assertEquals(1.0, salmon.getLength(), 0f);
        assertEquals(3, salmon.getSiblings().size());
        assertEquals(Shark.class, salmon.getSiblings().get(0).getClass());
        Shark sib1 = (Shark) (salmon.getSiblings().get(0));
        assertEquals(OffsetDateTime.of(2012, 1, 5, 1, 0, 0, 0, ZoneOffset.UTC), sib1.getBirthday());
        assertEquals(Sawshark.class, salmon.getSiblings().get(1).getClass());
        Sawshark sib2 = (Sawshark) (salmon.getSiblings().get(1));
        assertArrayEquals(
                new byte[]{(byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 254},
                sib2.getPicture());
        Goblinshark sib3 = (Goblinshark) (salmon.getSiblings().get(2));
        assertEquals(1, sib3.getAge().intValue());
        assertEquals(5, sib3.getJawsize().intValue());
        assertEquals(5, salmon.getAdditionalProperties().size());
        assertEquals(1, salmon.getAdditionalProperties().get("additionalProperty1"));
        assertEquals(false, salmon.getAdditionalProperties().get("additionalProperty2"));
        assertEquals("hello", salmon.getAdditionalProperties().get("additionalProperty3"));
        Object ad4 = salmon.getAdditionalProperties().get("additionalProperty4");
        assertTrue(Map.class.isAssignableFrom(ad4.getClass()));
        Map<String, Object> additionalProperty4 = (Map<String, Object>) ad4;
        assertEquals(2, additionalProperty4.size());
        assertEquals(1, additionalProperty4.get("a"));
        assertEquals(2, additionalProperty4.get("b"));
        Object ad5 = salmon.getAdditionalProperties().get("additionalProperty5");
        assertTrue(List.class.isAssignableFrom(ad5.getClass()));
        List<Integer> additionalProperty5 = (List<Integer>) ad5;
        assertEquals(2, additionalProperty5.size());
        assertEquals(1, additionalProperty5.get(0).intValue());
        assertEquals(3, additionalProperty5.get(1).intValue());
    }

    @Test
    public void putComplicated() {
        SmartSalmon body = new SmartSalmon(1.0f);
        body.setLocation("alaska");
        body.setIswild(true);
        body.setSpecies("king");
        body.setSiblings(new ArrayList<>());
        body.setAdditionalProperties(new HashMap<>());
        body.getAdditionalProperties().put("additionalProperty1", 1);
        body.getAdditionalProperties().put("additionalProperty2", false);
        body.getAdditionalProperties().put("additionalProperty3", "hello");
        Map<String, Integer> additionalProperty4 = new HashMap<>();
        additionalProperty4.put("a", 1);
        additionalProperty4.put("b", 2);
        body.getAdditionalProperties().put("additionalProperty4", additionalProperty4);
        body.getAdditionalProperties().put("additionalProperty5", Arrays.asList(1, 3));

        Shark sib1 = new Shark(20.0f, OffsetDateTime.of(2012, 1, 5, 1, 0, 0, 0, ZoneOffset.UTC));
        sib1.setAge(6);
        sib1.setSpecies("predator");
        body.getSiblings().add(sib1);

        Sawshark sib2 = new Sawshark(10.0f, OffsetDateTime.of(1900, 1, 5, 1, 0, 0, 0, ZoneOffset.UTC));
        sib2.setAge(105);
        sib2.setPicture(new byte[] {(byte) 255, (byte) 255, (byte) 255, (byte) 255, (byte) 254});
        sib2.setSpecies("dangerous");
        body.getSiblings().add(sib2);

        Goblinshark sib3 = new Goblinshark(30.0f, OffsetDateTime.of(2015, 8, 8, 0, 0, 0, 0, ZoneOffset.UTC));
        sib3.setAge(1);
        sib3.setSpecies("scary");
        sib3.setJawsize(5);
        sib3.setColor(GoblinSharkColor.fromString("pinkish-gray"));
        body.getSiblings().add(sib3);

        client.getPolymorphisms().putComplicated(body);
    }
}
