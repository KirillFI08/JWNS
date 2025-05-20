package fBlackJack;

import java.util.*;

public class Kartendeck {
    private Stack<Karten> karten;
    private static int anzahlKarten = 52-1;
    private static List<String> meineListe = new ArrayList<>();

    Random zufall = new Random();
    int zufallsIndex = zufall.nextInt(52);

    public static void main(String[] args) {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < anzahlKarten / 4; i++) {
                meineListe.add(kartenListe(j, i));

            }
        }
    }

    private static String kartenListe(int j, int i) {
        return Karten.farben(j) + " " + Karten.werte[i];
    }

    private static Stack kartendeck(List<String> kartenListe, Stack<Karten> a){
        

        return a; 
        
    }
}
