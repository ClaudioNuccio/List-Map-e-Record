import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void exercise() {
        OffsetDateTime test = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals("08 febbraio 2024", testing.exercise(test,1,1,7));
    }
}