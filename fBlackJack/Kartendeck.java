package fBlackJack;

import java.util.*;

public class Kartendeck {
    private static final int ANZAHL_KARTEN_PRO_FARBE = 13;
    private static final int ANZAHL_FARBEN = 4;

    // Methode zum Erzeugen und Mischen eines neuen Kartendecks
    public static Stack<Karten> neuesGemischtesDeck() {
        List<Karten> kartenListe = new ArrayList<>();

        for (int farbe = 0; farbe < ANZAHL_FARBEN; farbe++) {
            for (int wert = 0; wert < ANZAHL_KARTEN_PRO_FARBE; wert++) {
                kartenListe.add(new Karten(Karten.farben(farbe), Karten.werte[wert]));
            }
        }

        Collections.shuffle(kartenListe);

        Stack<Karten> kartenDeck = new Stack<>();
        kartenDeck.addAll(kartenListe);

        return kartenDeck;
    }
}

