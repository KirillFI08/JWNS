package e;


// Ein Listenknoten speichert Daten vom Typ T und einen Verweis auf den nächsten Knoten
public class ListenElement<T> {
    T daten;                  // Speichert die Daten des Knotens
    ListenElement<T> nachfolger; // Verweis auf den nächsten Knoten in der Liste

    // Konstruktor, der Daten und den nächsten Knoten festlegt
    ListenElement(T daten) {
        this.daten = daten;
        this.nachfolger = null;
    }
}
