package Es_01;

import Teoria.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Teoria.Main testing = new Main();

    @Test
    void sum_of_int() {
        int result = testing.sum(15,25);
        assertEquals(40, result, "Result of 15 + 25 should be 40.");
    }
    @Test
    public void testSum() {
        assertEquals(0, Main.sum(0, 0));
        assertEquals(-10, Main.sum(-5, -5));
        assertEquals(100, Main.sum(50, 50));
    }
}