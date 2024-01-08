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

}