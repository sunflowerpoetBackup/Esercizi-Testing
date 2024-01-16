package Es_03;
/*Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenendo 01 marzo 2023
Stampa sulla console
Crea dei test per questo esercizio*/

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println("Input Date & time: " + dateTimeString);

        String formattedDate = dateTimeString.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println("Data formattata: " + formattedDate);
    }
}
