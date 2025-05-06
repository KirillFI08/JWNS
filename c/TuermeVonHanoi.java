package c;

import java.util.Stack;

public class TuermeVonHanoi {
   public static void main(String[] args) {
       int anzahlScheiben = 3;
       Stack<Integer> quelle = new Stack<>();
       Stack<Integer> zwischen = new Stack<>();
       Stack<Integer> ziel = new Stack<>();
       // Scheiben von groß (unten) nach klein (oben) auf Quelle stapeln
       for (int i = anzahlScheiben; i >= 1; i--) {
           quelle.push(i);
       }
    }

    public static void hanoi(int n, Stack<Integer> quelle, Stack<Integer> ziel, Stack<Integer> zwischen,
            char nameQuelle, char nameZiel, char nameZwischen) {
        if (n == 1) {
            int scheibe = quelle.pop();
            ziel.push(scheibe);
            System.out.println("Bewege Scheibe" + scheibe + "von" +nameQuelle+"nach"+nameZiel);
        } else {
            hanoi(n - 1, quelle, zwischen, ziel, nameQuelle, nameZwischen, nameZiel);
            hanoi(1, quelle, ziel, zwischen, nameQuelle, nameZwischen, nameZiel);
            hanoi(n - 1, zwischen, ziel, quelle, nameZwischen, nameZiel, nameQuelle);
        }
    }

    /**
     * Gibt die Inhalte der drei Türme aus
     */
    public static void printTuerme(Stack<Integer> a, Stack<Integer> b, Stack<Integer> c) {
        System.out.println("\nAktueller Zustand der Türme:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("-------------------------------");
    
}
}