package Es_04;
import org.junit.Test;
import java.time.OffsetDateTime;
import java.time.DayOfWeek;
import static org.junit.Assert.assertEquals;
public class MainTest {
    @Test
    public void testGetYear() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int expectedYear = 2023;
        int actualYear = dateTime.getYear();
        assertEquals(expectedYear, actualYear);
    }

    @Test
    public void testGetMonth() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int expectedMonth = 3;
        int actualMonth = dateTime.getMonthValue();
        assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void testGetDay() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int expectedDay = 1;
        int actualDay = dateTime.getDayOfMonth();
        assertEquals(expectedDay, actualDay);
    }

    @Test
    public void testGetDayOfWeek() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DayOfWeek expectedDayOfWeek = DayOfWeek.WEDNESDAY;
        DayOfWeek actualDayOfWeek = dateTime.getDayOfWeek();
        assertEquals(expectedDayOfWeek, actualDayOfWeek);
    }
}
