import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Netzwerk {
    public ArrayList<Verbindung> verbindungen = new ArrayList<>();

    public void addVerbindung(Flughafen start, Flughafen ziel) {
        verbindungen.add(new Verbindung(start, ziel));
    }

    public static void main(String[] args){
        Flughafen A = new Flughafen ("A");
        Flughafen B = new Flughafen ("B");
        Flughafen C = new Flughafen ("C");
        Flughafen D = new Flughafen ("D");
        Flughafen E = new Flughafen ("E");
        Netzwerk netz = new Netzwerk();
        netz.addVerbindung(A, B);
        netz.addVerbindung(A, C);
        netz.addVerbindung(B, D);
        netz.addVerbindung(C, E);

        System.out.println(anzahlDirektVerbindungen(A, netz));
        System.out.println(getAnzahlKnoten(netz));



    }

    public static String anzahlDirektVerbindungen(Flughafen start, Netzwerk netz) {
        int count = 0;
        for (Verbindung v : netz.verbindungen) {
            if (v.start == start) {
                count++;
            }
        }
        return "Anzahl erreichbarer Flughäfen von "+start.name+": "+count;
    }

    public static String getAnzahlKnoten(Netzwerk netz) {
        Queue<Flughafen> toVisit = new LinkedList<>();
        ArrayList<Flughafen> visited = new ArrayList<>();
        int count = 0;
        for (Verbindung v : netz.verbindungen) {
            if (!v.start.besucht) {
                toVisit.add(v.start);
                v.start.besucht = true;
                visited.add(v.start);
                count++;
            }
            if (!v.ziel.besucht) {
                toVisit.add(v.ziel);
                v.ziel.besucht = true;
                visited.add(v.ziel);
                count++;
            }
        }
        StringBuilder names = new StringBuilder();
        for (Flughafen f : visited) {
            if (names.length() > 0) {
                names.append(", ");
            }
            names.append(f.name);
        }
        return "Anzahl erreichbarer Flughäfen: " + count + ": " + names.toString();
    }

}
