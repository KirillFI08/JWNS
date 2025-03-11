package Test;

import java.util.*;

public class Kursbelegung {

    public static void main(String[] args) {
        // Kursliste
        String[] kurse = {"M", "m", "D", "d", "E", "e", "F", "f", "Inf", "P", "p", "Ch", "ch", "B", "b", "mu", "bk", "s"};

        // Schüler mit belegten Kursen
        Map<String, Set<String>> belegung = new HashMap<>();
        belegung.put("Anna", Set.of("M", "D", "E", "P", "B"));
        belegung.put("Bert", Set.of("m", "d", "F", "Inf", "mu"));
        belegung.put("Cecile", Set.of("D", "e", "p", "Ch", "bk"));
        belegung.put("Dora", Set.of("E", "F", "P", "B", "s"));
        belegung.put("Erik", Set.of("M", "e", "Inf", "ch", "bk"));
        belegung.put("Felix", Set.of("m", "D", "F", "p", "B"));
        belegung.put("Greta", Set.of("d", "E", "f", "Ch", "s"));
        belegung.put("Heinz", Set.of("M", "m", "d", "E", "Inf"));
        belegung.put("Inge", Set.of("e", "F", "P", "b", "mu"));
        belegung.put("Justus", Set.of("D", "E", "ch", "bk", "s"));
        belegung.put("Klaus", Set.of("m", "F", "Inf", "p", "Ch"));

        // Bestimmen, welche Kurse parallel laufen können
        System.out.println("Parallele Kursmöglichkeiten:");
        for (int i = 0; i < kurse.length; i++) {
            for (int j = i + 1; j < kurse.length; j++) {
                String kurs1 = kurse[i];
                String kurs2 = kurse[j];

                if (könnenParallelLaufen(kurs1, kurs2, belegung)) {
                    System.out.println(kurs1 + " || " + kurs2);
                }
            }
        }

        // Züge bestimmen, sodass jeder Schüler einem Zug zugeordnet wird
        List<Set<String>> züge = findeZüge(kurse, belegung, 8);

        System.out.println("\nGefundene Züge:");
        int zugNummer = 1;
        for (Set<String> zug : züge) {
            System.out.println("Zug " + zugNummer + ": " + zug);
            zugNummer++;
        }
    }

    private static boolean könnenParallelLaufen(String kurs1, String kurs2, Map<String, Set<String>> belegung) {
        for (Set<String> kurse : belegung.values()) {
            if (kurse.contains(kurs1) && kurse.contains(kurs2)) {
                return false;
            }
        }
        return true;
    }

    private static List<Set<String>> findeZüge(String[] kurse, Map<String, Set<String>> belegung, int anzahlZüge) {
        List<Set<String>> züge = new ArrayList<>();
        for (int i = 0; i < anzahlZüge; i++) {
            züge.add(new HashSet<>());
        }

        Set<String> verwendeteKurse = new HashSet<>();

        for (String kurs : kurse) {
            if (!verwendeteKurse.contains(kurs)) {
                for (Set<String> zug : züge) {
                    boolean kannHinzugefügtWerden = true;

                    for (String bestehenderKurs : zug) {
                        if (!könnenParallelLaufen(kurs, bestehenderKurs, belegung)) {
                            kannHinzugefügtWerden = false;
                            break;
                        }
                    }

                    if (kannHinzugefügtWerden) {
                        zug.add(kurs);
                        verwendeteKurse.add(kurs);
                        break;
                    }
                }
            }
        }

        return züge;
    }
}
