package i;

import java.util.ArrayList;

public class SchalkeSpieler extends Spieler {

    public SchalkeSpieler(String name, int nummer, int alter, int tore) {
        super(name,nummer, alter, tore);
    }

    public String printInfo(){
        return "Name: "+name+", Nummer: "+nummer+", Alter: "+alter+", Tore: "+tore;
    }

    public String besterSpieler(ArrayList<SchalkeSpieler> spielerListe){
        SchalkeSpieler bSpieler = spielerListe.get(0);
        for(int i = 1; i<=spielerListe.size(); i++){
            if(spielerListe.get(i).tore > bSpieler.tore){
                bSpieler = spielerListe.get(i);
            }
            
        }

        return bSpieler.printInfo();
    }

    

}
