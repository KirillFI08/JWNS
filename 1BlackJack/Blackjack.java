package fBlackJack;

import java.util.Scanner;
import java.util.Stack;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen zu Blackjack!");

        // Optional: Startguthaben setzen, falls nicht in Kontostand-Klasse
        // Kontostand.setKontostand(100);

        boolean weiterspielen = true;
        while (weiterspielen) {
            // Prüfen, ob noch Guthaben vorhanden ist
            if (Kontostand.getKontostand() <= 0) {
                System.out.println("Sie haben kein Guthaben mehr. Spiel beendet.");
                break;
            }

            double einsatz = einsatzSetzen(scanner);
            if (einsatz == 0) {
                System.out.println("Spiel beendet.");
                break;
            }

            // Neues gemischtes Deck holen
            Stack<Karten> deck = Kartendeck.neuesGemischtesDeck();
            Stack<Karten> spielerHand = new Stack<>();
            Stack<Karten> dealerHand = new Stack<>();

            // Karten austeilen
            spielerHand.push(deck.pop());
            dealerHand.push(deck.pop());
            spielerHand.push(deck.pop());
            dealerHand.push(deck.pop());

            System.out.println("Dealer zeigt: " + dealerHand.get(0));
            System.out.println("Deine Karten: " + spielerHand);
            System.out.println("Punkte: " + berechnePunkte(spielerHand));

            // Spielerzug
            boolean spielerHatUeberkauft = false;
            while (true) {
                System.out.print("Willst du 'ziehen' oder 'passen'? ");
                String eingabe = scanner.nextLine();

                if (eingabe.equalsIgnoreCase("ziehen")) {
                    spielerHand.push(deck.pop());
                    int punkte = berechnePunkte(spielerHand);
                    System.out.println("Du hast eine Karte gezogen: " + spielerHand.peek());
                    System.out.println("Deine Karten: " + spielerHand + " (Punkte: " + punkte + ")");
                    if (punkte > 21) {
                        System.out.println("Du hast überkauft! Verloren.");
                        spielerHatUeberkauft = true;
                        break;
                    }
                } else if (eingabe.equalsIgnoreCase("passen")) {
                    break;
                } else {
                    System.out.println("Ungültige Eingabe, bitte 'ziehen' oder 'passen' eingeben.");
                }
            }

            // Dealerzug nur, wenn Spieler nicht überkauft hat
            if (!spielerHatUeberkauft) {
                System.out.println("Dealer Karten: " + dealerHand + " (Punkte: " + berechnePunkte(dealerHand) + ")");
                while (berechnePunkte(dealerHand) < 17) {
                    dealerHand.push(deck.pop());
                    System.out.println("Dealer zieht: " + dealerHand.peek());
                    System.out.println("Dealer Karten: " + dealerHand + 
                    " (Dealer: " + berechnePunkte(dealerHand) + "  Spieler: "+ berechnePunkte(spielerHand) + ")");
                }
            }

            int spielerPunkte = berechnePunkte(spielerHand);
            int dealerPunkte = berechnePunkte(dealerHand);

            // Ergebnis und Auszahlung
            if (spielerPunkte > 21) {
                System.out.println("Du hast verloren. Einsatz verloren.");
                // Einsatz bleibt abgezogen
            } else if (dealerPunkte > 21 || spielerPunkte > dealerPunkte) {
                System.out.println("Du gewinnst!");
                Kontostand.setKontostand(Kontostand.getKontostand() + einsatz * 2);
            } else if (spielerPunkte == dealerPunkte) {
                System.out.println("Unentschieden. Einsatz zurück.");
                Kontostand.setKontostand(Kontostand.getKontostand() + einsatz);
            } else {
                System.out.println("Dealer gewinnt. Einsatz verloren.");
            }
            System.out.println("Aktueller Kontostand: " + Kontostand.getKontostand() + " Euro");

            // Neue Runde?
            System.out.println("Noch ein Spiel? Drücke '1', sonst beliebige Taste");
            String eingabe = scanner.nextLine();
            if (!eingabe.equalsIgnoreCase("1")) {
                weiterspielen = false;
                System.out.println("Danke fürs Spielen!");
            }
        }
        scanner.close();
    }

    // Einsatz setzen und vom Kontostand abziehen
    private static double einsatzSetzen(Scanner scanner) {
        System.out.println("Ihr aktueller Kontostand ist: " + Kontostand.getKontostand() + " Euro");
        System.out.print("Wie viel wollen Sie setzen? (0 zum Beenden): ");
        double einsatz = 0;
        while (true) {
            try {
                einsatz = Double.parseDouble(scanner.nextLine());
                if (einsatz == 0) return 0;
                if (einsatz > 0 && einsatz <= Kontostand.getKontostand()) {
                    Kontostand.setKontostand(Kontostand.getKontostand() - einsatz);
                    System.out.println("Einsatz von " + einsatz + " Euro wurde gesetzt. Neuer Kontostand: " + Kontostand.getKontostand() + " Euro");
                    return einsatz;
                } else {
                    System.out.print("Ungültiger Einsatz. Bitte erneut eingeben: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Bitte eine Zahl eingeben: ");
            }
        }
    }

    // Punkte berechnen (Ass kann 1 oder 11 sein)
    private static int berechnePunkte(Stack<Karten> hand) {
        int summe = 0;
        int assAnzahl = 0;

        for (Karten karte : hand) {
            String wert = karte.toString().split(" ")[1]; // z.B. "Herz Ass" -> "Ass"
            switch (wert) {
                case "Ass":
                    assAnzahl++;
                    summe += 11;
                    break;
                case "König":
                case "Dame":
                case "Bube":
                    summe += 10;
                    break;
                default:
                    summe += Integer.parseInt(wert);
                    break;
            }
        }
        while (summe > 21 && assAnzahl > 0) {
            summe -= 10;
            assAnzahl--;
        }
        return summe;
    }
}