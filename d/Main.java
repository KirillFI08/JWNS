package d;

public class Main {
    public static void main(String[] args) {
        QueueWithList<Integer> queue = new QueueWithList<>();

        // Test: enqueue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Test: front
        System.out.println("Vorderstes Element: " + queue.front()); // 10

        // Test: dequeue
        System.out.println("Entferntes Element: " + queue.dequeue()); // 10
        System.out.println("Neues vorderstes Element: " + queue.front()); // 20

        // Test: isEmpty
        System.out.println("Ist die Queue leer? " + queue.isEmpty()); // false

        // Alle Elemente entfernen
        queue.dequeue();
        queue.dequeue();
        System.out.println("Ist jetzt leer? " + queue.isEmpty()); // true
    }
}

