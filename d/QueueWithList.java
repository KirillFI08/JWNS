package d;

public class QueueWithList<T> {
    private LinkedList<T> dieListe;

    public QueueWithList() {
        dieListe = new LinkedList<>();
    }

    public boolean isEmpty() {
        return dieListe.istLeer();
    }

    public void enqueue(T x) {
        dieListe.anhaengen(x);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue ist leer");
        }
        T wert = dieListe.get(0);
        dieListe.entferneBei(0);
        return wert;
    }

    public T front() {
        if (isEmpty()) {
            throw new RuntimeException("Queue ist leer");
        }
        return dieListe.get(0);
    }
}

