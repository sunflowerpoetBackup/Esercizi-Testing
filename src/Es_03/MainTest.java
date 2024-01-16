package Es_03;
import org.junit.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.Assert.assertEquals;
public class MainTest {
    @Test
    public void testDateParsing() {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = "2002-03-01T13:00:00Z";
        String actual = dateTimeString.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        assertEquals(expected, actual);
    }

    @Test
    public void testDateFormatting() {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formattedDate = dateTimeString.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        assertEquals("01 March 2002", formattedDate);
    }
}
