package i;

import java.util.ArrayList;

public class SchalkeAuswertung {
    public static void main(String[] args){
        ArrayList <SchalkeSpieler> spielerListe = new ArrayList<>();
        spielerListe.add(new SchalkeSpieler("Sebastian", 23, 17, 0));
        spielerListe.add(new SchalkeSpieler ("Enes", 67, 17, 34));
        spielerListe.add( new SchalkeSpieler("Kirill", 11, 17, 33));


        System.out.println(schalkeInfo(spielerListe));
        

    }

    public static String schalkeInfo(ArrayList<SchalkeSpieler> spielerListe){
        System.out.println("Schalke Spieler Liste:");
        SchalkeSpieler bSpieler = spielerListe.get(0);
        for(int i = 0; i<spielerListe.size(); i++){
            if(spielerListe.get(i).tore > bSpieler.tore){
                bSpieler = spielerListe.get(i);
            }
            System.out.println(spielerListe.get(i).printInfo());
        }

        return "Spieler mit den meisten Toren bei Schalke: "+bSpieler.printInfo();
    }
} 
