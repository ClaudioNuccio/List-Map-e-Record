import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
private final Main testing = new Main();
    @Test
    void getYear() {
        OffsetDateTime test = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("2023",testing.getYear(test));
    }

    @Test
    void getMonth() {
        OffsetDateTime test = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("marzo",testing.getMonth(test));
    }

    @Test
    void getDayOfMonth() {
        OffsetDateTime test = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("01",testing.getDayOfMonth(test));
    }

    @Test
    void getDayOfWeek() {
        OffsetDateTime test = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("mercoledì",testing.getDayOfWeek(test));
    }
}