import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;

public class Netzwerk {

    public static ArrayList<Verbindung> verbindungen = new ArrayList<>();

    public static void addVerbindung(Verbindung v) {
        verbindungen.add(v);
    }

    public static void main(String[] args) {
        Flughafen A = new Flughafen("A");
        Flughafen B = new Flughafen("B");
        Flughafen C = new Flughafen("C");
        Flughafen D = new Flughafen("D");
        Flughafen E = new Flughafen("E");

        Verbindung AB = new Verbindung(A, B);
        Verbindung AC = new Verbindung(A, C);
        Verbindung BD = new Verbindung(B, D);
        Verbindung CE = new Verbindung(C, E);

        addVerbindung(AB);
        addVerbindung(AC);
        addVerbindung(BD);
        addVerbindung(CE);

        // ✅ Alle Flughäfen in einer Liste speichern, damit man sie resetten kann
        ArrayList<Flughafen> alle = new ArrayList<>();
        alle.add(A);
        alle.add(B);
        alle.add(C);
        alle.add(D);
        alle.add(E);

        // Test 1
        resetBesucht(alle);
        zahlDirektVerbindung(A);

        // Test 2 (rekursiv)
        resetBesucht(alle);
        zaehleFlughaefen(A);
    }

    // --- Hilfsmethode zum Zurücksetzen ---
    private static void resetBesucht(ArrayList<Flughafen> flughaefen) {
        for (Flughafen f : flughaefen) {
            f.besucht = false;
        }
    }

    // --- Direkte Verbindungen zählen ---
    public static void zahlDirektVerbindung(Flughafen start) {
        int count = 0;
        for (Verbindung v : verbindungen) {
            if (v.start == start) {
                count++;
            }
        }
        System.out.println("Anzahl der direkten Verbindungen von " + start.name + ": " + count);
    }

    // --- Rekursive Version ---
    public static void zaehleFlughaefen(Flughafen start) {
        ArrayList<Flughafen> erreichbar = new ArrayList<>();
        start.besucht = true;

        findeErreichbare(start, erreichbar);

        System.out.println("Anzahl der erreichbaren Flughäfen von " + start.name + ": " + erreichbar.size());
        System.out.print("Erreichbare Flughäfen: ");
        for (Flughafen f : erreichbar) {
            System.out.print(f.name + " ");
        }
        System.out.println();
    }

    private static void findeErreichbare(Flughafen aktuell, ArrayList<Flughafen> erreichbar) {
        for (Verbindung v : verbindungen) {
            if (v.start == aktuell && !v.ziel.besucht) {
                v.ziel.besucht = true;
                erreichbar.add(v.ziel);
                // Rekursiver Aufruf
                findeErreichbare(v.ziel, erreichbar);
            }
        }
    }

} 