package BlackJack;

public class Karten {
    private String farbe;
    private String wert;

    public Karten(String farbe, String wert) {
        this.farbe = farbe;
        this.wert = wert;
    }

    public static String farben(int index) {
        String[] farben = {"Herz", "Karo", "Pik", "Kreuz"};
        return farben[index];
    }

    public static String[] werte = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Bube", "Dame", "König", "Ass"};

    @Override
    public String toString() {
        return farbe + " " + wert;
    }
}
