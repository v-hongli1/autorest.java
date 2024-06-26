package fixtures.bodycomplex;

import fixtures.bodycomplex.models.BooleanWrapper;
import fixtures.bodycomplex.models.ByteWrapper;
import fixtures.bodycomplex.models.DateWrapper;
import fixtures.bodycomplex.models.DatetimeWrapper;
import fixtures.bodycomplex.models.Datetimerfc1123Wrapper;
import fixtures.bodycomplex.models.DoubleWrapper;
import fixtures.bodycomplex.models.DurationWrapper;
import fixtures.bodycomplex.models.FloatWrapper;
import fixtures.bodycomplex.models.IntWrapper;
import fixtures.bodycomplex.models.LongWrapper;
import fixtures.bodycomplex.models.StringWrapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PrimitiveTests {
    private static AutoRestComplexTestService client;

    @BeforeAll
    public static void setup() {
        client = new AutoRestComplexTestServiceBuilder().buildClient();
    }

    @Test
    public void getInt() {
        IntWrapper result = client.getPrimitives().getInt();
        assertEquals(-1, result.getField1().intValue());
        assertEquals(2, result.getField2().intValue());
    }

    @Test
    public void putInt() {
        IntWrapper body = new IntWrapper();
        body.setField1(-1);
        body.setField2(2);
        client.getPrimitives().putIntWithResponseAsync(body).block();
    }

    @Test
    public void getLong() {
        LongWrapper result = client.getPrimitives().getLong();
        assertEquals(1099511627775L, result.getField1().longValue());
        assertEquals(-999511627788L, result.getField2().longValue());
    }

    @Test
    public void putLong() {
        LongWrapper body = new LongWrapper();
        body.setField1(1099511627775L);
        body.setField2(-999511627788L);
        client.getPrimitives().putLongWithResponseAsync(body).block();
    }

    @Test
    public void getFloat() {
        FloatWrapper result = client.getPrimitives().getFloat();
        assertEquals(1.05f, result.getField1(), 0f);
        assertEquals(-0.003f, result.getField2(), 0f);
    }

    @Test
    public void putFloat() {
        FloatWrapper body = new FloatWrapper();
        body.setField1(1.05f);
        body.setField2(-0.003f);
        client.getPrimitives().putFloatWithResponseAsync(body).block();
    }

    @Test
    public void getDouble() {
        DoubleWrapper result = client.getPrimitives().getDouble();
        assertEquals(3e-100, result.getField1(), 0f);
        assertEquals(-0.000000000000000000000000000000000000000000000000000000005,
                result.getField56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose(),
                0f);
    }

    @Test
    public void putDouble() {
        DoubleWrapper body = new DoubleWrapper();
        body.setField1(3e-100);
        body.setField56ZerosAfterTheDotAndNegativeZeroBeforeDotAndThisIsALongFieldNameOnPurpose(-5e-57);
        client.getPrimitives().putDoubleWithResponseAsync(body).block();
    }

    @Test
    public void getBool() {
        BooleanWrapper result = client.getPrimitives().getBool();
        assertEquals(true, result.isFieldTrue());
        assertEquals(false, result.isFieldFalse());
    }

    @Test
    public void putBool() {
        BooleanWrapper body = new BooleanWrapper();
        body.setFieldFalse(false);
        body.setFieldTrue(true);
        client.getPrimitives().putBoolWithResponseAsync(body).block();
    }

    @Test
    public void getString() {
        StringWrapper result = client.getPrimitives().getString();
        assertEquals("goodrequest", result.getField());
        assertEquals("", result.getEmpty());
        assertNull(result.getNullProperty());
    }

    @Test
    public void putString() {
        StringWrapper body = new StringWrapper();
        body.setField("goodrequest");
        body.setEmpty("");
        client.getPrimitives().putStringWithResponseAsync(body).block();
    }

    @Test
    public void getDate() {
        DateWrapper result = client.getPrimitives().getDate();
        assertEquals(LocalDate.of(1, 1, 1), result.getField());
        assertEquals(LocalDate.of(2016, 2, 29), result.getLeap());
    }

    @Test
    public void putDate() {
        DateWrapper body = new DateWrapper();
        body.setField(LocalDate.of(1, 1, 1));
        body.setLeap(LocalDate.of(2016, 2, 29));
        client.getPrimitives().putDateWithResponseAsync(body).block();
    }

    @Test
    public void getDateTime() {
        DatetimeWrapper result = client.getPrimitives().getDateTime();
        assertEquals(OffsetDateTime.of(1, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC), result.getField());
        assertEquals(OffsetDateTime.of(2015, 5, 18, 18, 38, 0, 0, ZoneOffset.UTC), result.getNow());
    }

    @Test
    public void putDateTime() {
        DatetimeWrapper body = new DatetimeWrapper();
        body.setField(OffsetDateTime.of(1, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC));
        body.setNow(OffsetDateTime.of(2015, 5, 18, 18, 38, 0, 0, ZoneOffset.UTC));
        client.getPrimitives().putDateTimeWithResponseAsync(body).block();
    }

    @Test
    public void getDateTimeRfc1123() {
        Datetimerfc1123Wrapper result = client.getPrimitives().getDateTimeRfc1123();
        assertEquals(OffsetDateTime.of(1, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC), result.getField());
        assertEquals(OffsetDateTime.of(2015, 5, 18, 11, 38, 0, 0, ZoneOffset.UTC), result.getNow());
    }

    @Test
    public void putDateTimeRfc1123() {
        Datetimerfc1123Wrapper body = new Datetimerfc1123Wrapper();
        body.setField(OffsetDateTime.of(1, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC));
        body.setNow(OffsetDateTime.of(2015, 5, 18, 11, 38, 0, 0, ZoneOffset.UTC));
        client.getPrimitives().putDateTimeRfc1123WithResponseAsync(body).block();
    }

    @Test
    public void getDuration() {
        DurationWrapper result = client.getPrimitives().getDuration();
        assertEquals(Duration.ofDays(123).plusHours(22).plusMinutes(14).plusSeconds(12).plusMillis(11), result.getField());
    }

    @Test
    public void putDuration() {
        DurationWrapper body = new DurationWrapper();
        body.setField(Duration.ofDays(123).plusHours(22).plusMinutes(14).plusSeconds(12).plusMillis(11));
        client.getPrimitives().putDurationWithResponseAsync(body).block();
    }

    @Test
    public void getByte() {
        ByteWrapper result = client.getPrimitives().getByte();
        byte[] expected = new byte[] {
                (byte) 255, (byte) 254, (byte) 253, (byte) 252, (byte) 0,
                (byte) 250, (byte) 249, (byte) 248, (byte) 247, (byte) 246
        };
        assertArrayEquals(expected, result.getField());
    }

    @Test
    public void putByte() {
        ByteWrapper body = new ByteWrapper();
        byte[] byteArray = new byte[] {
                (byte) 255, (byte) 254, (byte) 253, (byte) 252, (byte) 0,
                (byte) 250, (byte) 249, (byte) 248, (byte) 247, (byte) 246
        };
        body.setField(byteArray);
        client.getPrimitives().putByteWithResponseAsync(body).block();
    }
}
