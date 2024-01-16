package Es_04;
/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console -Crea dei test per questo esercizio*/

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Input Date & time: " + dateTimeString);

        int year = dateTimeString.getYear();
        System.out.println("Anno: " + year);

        int month = dateTimeString.getMonthValue();
        System.out.println("Mese: " + month);

        int day = dateTimeString.getDayOfMonth();
        System.out.println("Giorno: " + day);

        DayOfWeek dayOfWeek = dateTimeString.getDayOfWeek();
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }
}
