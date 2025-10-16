package BlackJack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Neues gemischtes Deck vom Kartendeck holen
        Stack<Karten> deck = Kartendeck.neuesGemischtesDeck();

        Stack<Karten> spielerHand = new Stack<>();
        Stack<Karten> dealerHand = new Stack<>();

        // Anfangskarten austeilen
        spielerHand.push(deck.pop());
        dealerHand.push(deck.pop());
        spielerHand.push(deck.pop());
        dealerHand.push(deck.pop());

        System.out.println("Willkommen zu Blackjack!");
        System.out.println("Dealer zeigt: " + dealerHand.get(0));
        System.out.println("Deine Karten: " + spielerHand + " (Punkte: " + berechnePunkte(spielerHand) + ")");

        // Spielerzug
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
                    scanner.close();
                    return;
                }
            } else if (eingabe.equalsIgnoreCase("passen")) {
                break;
            } else {
                System.out.println("Ungültige Eingabe, bitte 'ziehen' oder 'passen' eingeben.");
            }
        }

        // Dealer zieht nach Regeln (mindestens 17 Punkte)
        System.out.println("Dealer Karten: " + dealerHand + " (Punkte: " + berechnePunkte(dealerHand) + ")");
        while (berechnePunkte(dealerHand) < 17) {
            dealerHand.push(deck.pop());
            System.out.println("Dealer zieht: " + dealerHand.peek());
            System.out.println("Dealer Karten: " + dealerHand + " (Punkte: " + berechnePunkte(dealerHand) + ")");
        }

        int spielerPunkte = berechnePunkte(spielerHand);
        int dealerPunkte = berechnePunkte(dealerHand);

        // Ergebnis ermitteln
        if (dealerPunkte > 21 || spielerPunkte > dealerPunkte) {
            System.out.println("Du gewinnst!");
        } else if (spielerPunkte == dealerPunkte) {
            System.out.println("Unentschieden.");
        } else {
            System.out.println("Dealer gewinnt.");
        }

        scanner.close();
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