package Es_02;
import org.junit.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
public class MainTest {
    private String normalizeSpaces(String input) {
        return input.replaceAll("\\p{Z}", " ").trim();
    }

    @Test
    public void testFullFormat() {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = "Friday, March 1, 2002, 1:00 PM";
        String actual = normalizeSpaces(dateTimeString.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT).withLocale(Locale.US)));
        assertEquals(expected, actual);
    }

    @Test
    public void testMediumFormat() {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = "Mar 1, 2002, 1:00 PM";
        String actual = normalizeSpaces(dateTimeString.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT).withLocale(Locale.US)));
        assertEquals(expected, actual);
    }

    @Test
    public void testShortFormat() {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = "3/1/02, 1:00 PM";
        String actual = normalizeSpaces(dateTimeString.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT).withLocale(Locale.US)));
        assertEquals(expected, actual);
    }
}

