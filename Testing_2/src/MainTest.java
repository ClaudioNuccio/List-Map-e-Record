import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

class MainTest {
    private final Main testing = new Main();

    @Test
    void printFull() {
OffsetDateTime test = OffsetDateTime.parse("2002-03-01T13:00:00Z");
     Assert.assertEquals("venerdì 1 marzo 2002",testing.printFull(test));
    }

    @Test
    void printMedium() {
        OffsetDateTime test = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        Assert.assertEquals("1 mar 2002",testing.printMedium(test));
    }

    @Test
    void printShort() {
        OffsetDateTime test = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        Assert.assertEquals("01/03/02",testing.printShort(test));
    }


}