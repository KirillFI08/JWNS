import java.util.Random;

public class WeihnachtsbaumCopy {
    public static void main(String[] args) {
        Random random = new Random();
        int länge = 15;

        // ANSI Escape Codes für Farben
        String grün = "\u001B[32m";   // Grün für den Baum
        String rot = "\u001B[31m";    // Rot für Weihnachtsbaumkugeln
        String reset = "\u001B[0m";   // Zurücksetzen der Farbe

        // Baum aufbauen
        for (int l = 1; l <= länge; l++) {
            int abstand = länge - l;
            
            // Leerzeichen für zentrierte Ausrichtung
            for (int i = abstand; i >= 0; i--) {
                System.out.print(" ");
            }

            // Baum mit Weihnachtsbaumkugeln zufällig dekorieren
            int max = l * 2;
            for (int i = 1; i < max; i++) {
                // Zufällige Entscheidung, ob eine Kugel oder ein "1" gedruckt wird
                if (random.nextInt(5) == 0) {  // Etwa 20% Chance für eine Kugel
                    System.out.print(rot + "@" + reset);  // Weihnachtsbaumkugel
                } else {
                    System.out.print(grün + "1" + reset);  // Baumteil
                }
            }

            System.out.println("");  // Zum nächsten Baum-Level wechseln
        }

        if(länge<=6){
            int l = länge - 1;;
            for(int i = 0; i<l; i++){
                System.out.print(" ");
            }
            System.out.print("[ ]");
        }

        if(länge>6){
            int l = länge-2;
            for(int q = 0; q<2; q++){
            for(int i = 0; i<l; i++){
                System.out.print(" ");
            }
            System.out.print("[   ]");
        
            System.out.println("");
        }
        }
    }
}



