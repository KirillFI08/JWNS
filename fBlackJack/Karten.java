package fBlackJack;

public class Karten {
    public static String farben(int index) {
        String[] farben = {"Herz", "Karo", "Pik", "Kreuz"};
        return farben[index];
    }

    public static String[] werte = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Bube", "Dame", "König", "Ass"};
}