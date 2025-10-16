package fBlackJack;

public class Kontostand {
    private static double kontostand = 1000.0; // Startkontostand

    public static void main(String[] args) {
        // Beispiel-Kontostand
        System.out.println("Aktueller Kontostand: " + kontostand + " Euro");

        // Beispiel für eine Einzahlung
        double einzahlung = 200.0;
        kontostand += einzahlung;
        System.out.println("Nach Einzahlung von " + einzahlung + " Euro: " + kontostand + " Euro");

        // Beispiel für eine Auszahlung
        double auszahlung = 150.0;
        if (auszahlung <= kontostand) {
            kontostand -= auszahlung;
            System.out.println("Nach Auszahlung von " + auszahlung + " Euro: " + kontostand + " Euro");
        } else {
            System.out.println("Nicht genügend Guthaben für die Auszahlung von " + auszahlung + " Euro.");
        }
    }

    public static double getKontostand() {
        return kontostand;
    }

    public static void setKontostand(double neuerKontostand) {
        kontostand = neuerKontostand;
    }
}
