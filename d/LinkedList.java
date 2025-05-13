package d;

public class LinkedList<T> {
    private Listenknoten<T> anfang;

    public LinkedList() {
        anfang = null;
    }

    public boolean istLeer() {
        return anfang == null;
    }

    public void anhaengen(T val) {
        if (anfang == null) {
            anfang = new Listenknoten<>(val, null);
        } else {
            Listenknoten<T> aktuell = anfang;
            while (aktuell.nachfolger != null) {
                aktuell = aktuell.nachfolger;
            }
            aktuell.nachfolger = new Listenknoten<>(val, null);
        }
    }

    public T get(int n) {
        Listenknoten<T> aktuell = anfang;
        for (int i = 0; i < n; i++) {
            if (aktuell == null) throw new IndexOutOfBoundsException();
            aktuell = aktuell.nachfolger;
        }
        if (aktuell == null) throw new IndexOutOfBoundsException();
        return aktuell.daten;
    }

    public void entferneBei(int index) {
        if (anfang == null) return;

        if (index == 0) {
            anfang = anfang.nachfolger;
            return;
        }

        Listenknoten<T> aktuell = anfang;
        for (int i = 0; i < index - 1; i++) {
            if (aktuell.nachfolger == null) return;
            aktuell = aktuell.nachfolger;
        }

        if (aktuell.nachfolger != null) {
            aktuell.nachfolger = aktuell.nachfolger.nachfolger;
        }
    }
}

