package d;

// Die QueueWithList verwendet eine LinkedList zur Implementierung einer Warteschlange
public class QueueWithList<T> {
    private LinkedList<T> liste = new LinkedList<>(); // Instanz der LinkedList
    private ListenElement<T> anfang;

    // Gibt zurück, ob die Queue leer ist, indem die istLeer-Methode der LinkedList aufgerufen wird
    public boolean isEmpty() {
        return liste.istLeer();
    }

    // Fügt ein Element am Ende der Queue hinzu (Verwendet die anhaengen-Methode der LinkedList)
    public void enqueue(T x) {
        liste.anhaengen(x);
    }

    // Entfernt das erste Element der Queue und gibt es zurück
    public T dequeue() {
        T x = liste.get(0); // Das erste Element holen
        liste.entferneBei(0); // Das erste Element entfernen
        return x; // Das entfernte Element zurückgeben
    }

    // Gibt das erste Element der Queue zurück, ohne es zu entfernen
    public T front() {
        return liste.get(0); // Holt das erste Element der Liste
    }

    
}


