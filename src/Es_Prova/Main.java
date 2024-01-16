package Es_Prova;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> people = Map.of("Anna", 22, "Alex", 27, "Alessandra", 20, "Nikolay", 21);

        System.out.println("Original values:");
        for (Integer value : people.values()) {
            System.out.println(value);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(people.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("\nSorted values by age:");
        for (Integer value : sortedMap.values()) {
            System.out.println(value);
        }
    }
}

