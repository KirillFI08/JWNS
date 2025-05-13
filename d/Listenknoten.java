package d;


public class Listenknoten<T> {
    T daten;
    Listenknoten<T> nachfolger;

    public Listenknoten(T daten, Listenknoten<T> nachfolger) {
        this.daten = daten;
        this.nachfolger = nachfolger;
    }

}