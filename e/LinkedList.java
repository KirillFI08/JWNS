package e;

// Die LinkedList speichert eine Reihe von Listenknoten und bietet Operationen wie Anfügen und Entfernen
public class LinkedList<T> {
    private ListenElement<T> anfang; // Der erste Knoten der Liste

    // Gibt zurück, ob die Liste leer ist (anfang zeigt auf null)
    public boolean istLeer() {
        return anfang == null;
    }

    // Fügt ein Element am Ende der Liste an
    public void anhaengen(T val) {
        if (anfang == null) {
            // Wenn die Liste leer ist, wird der erste Knoten gesetzt
            anfang = new ListenElement<>(val);
        } else {
            // Wenn die Liste nicht leer ist, gehe zum letzten Knoten
            ListenElement<T> aktuell = anfang;
            while (aktuell.nachfolger != null) {
                aktuell = aktuell.nachfolger; // Zum nächsten Knoten weitergehen
            }
            // Neuen Knoten am Ende der Liste anfügen
            aktuell.nachfolger = new ListenElement<>(val);
        }
    }

    // Gibt das Element am Index n zurück
    public T get(int n) {
        ListenElement<T> aktuell = anfang;
        for (int i = 0; i < n; i++) {
            if (aktuell == null) throw new IndexOutOfBoundsException(); // Fehler, wenn Index zu groß ist
            aktuell = aktuell.nachfolger; // Weiter zum nächsten Knoten
        }
        return aktuell.daten; // Das gewünschte Element zurückgeben
    }

    // Entfernt das Element an der gegebenen Indexposition
    public void entferneBei(int i) {
        if (i == 0) {
            anfang = anfang.nachfolger; // Wenn der erste Knoten entfernt wird, wird der anfang auf den nächsten Knoten gesetzt
        } else {
            ListenElement<T> aktuell = anfang;
            for (int j = 0; j < i - 1; j++) {
                if (aktuell.nachfolger == null) return; // Wenn der Index ungültig ist, nichts tun
                aktuell = aktuell.nachfolger; // Zum nächsten Knoten weitergehen
            }
            if (aktuell.nachfolger != null) {
                aktuell.nachfolger = aktuell.nachfolger.nachfolger; // Den Knoten nach dem zu entfernenden Knoten überspringen
            }
        }
    }
}