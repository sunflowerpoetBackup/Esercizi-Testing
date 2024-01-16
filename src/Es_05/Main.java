package Es_05;

import java.time.OffsetDateTime;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
aggiungi un anno
sottrai un mese
aggiungi 7 giorni
Stampa il risultato localizzata per l'Italia
Crea dei test per questo esercizio*/

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Input Date & time: " + dateTimeString);

        OffsetDateTime nextYear = dateTimeString.plusYears(1);

        OffsetDateTime lastMonth = nextYear.minusMonths(1);

        OffsetDateTime nextWeek = lastMonth.plus(7, ChronoUnit.DAYS);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT).withLocale(Locale.ITALY);

        String formattedResult = nextWeek.format(formatter);
        System.out.println("Updated date & time, localized in Italy: " + formattedResult);
    }
}
