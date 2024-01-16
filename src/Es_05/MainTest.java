package Es_05;
import org.junit.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.time.format.FormatStyle;
import static org.junit.Assert.assertEquals;

public class MainTest {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX");

    @Test
    public void testDateManipulation() {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime nextYear = dateTimeString.plusYears(1);
        assertEquals("2024-03-01T13:00:00Z", formatOffsetDateTime(nextYear));

        OffsetDateTime lastMonth = nextYear.minusMonths(1);
        assertEquals("2024-02-01T13:00:00Z", formatOffsetDateTime(lastMonth));

        OffsetDateTime nextWeek = lastMonth.plus(7, ChronoUnit.DAYS);
        assertEquals("2024-02-08T13:00:00Z", formatOffsetDateTime(nextWeek));
    }

    private String formatOffsetDateTime(OffsetDateTime dateTime) {
        return FORMATTER.format(dateTime);
    }

    @Test
    public void testDateLocalization() {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime nextYear = dateTimeString.plusYears(1);
        OffsetDateTime lastMonth = nextYear.minusMonths(1);
        OffsetDateTime nextWeek = lastMonth.plus(7, ChronoUnit.DAYS);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT).withLocale(Locale.ITALY);

        String formattedResult = nextWeek.format(formatter);
        assertEquals("giovedì 8 febbraio 2024, 13:00", formattedResult);
    }
}

