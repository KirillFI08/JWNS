package h;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Fahrzeug> alleFahrzeuge = new ArrayList<>();

        alleFahrzeuge.add(new Auto("BMW", 45));
        alleFahrzeuge.add(new Fahrrad("Mountain Bike", 13));
        alleFahrzeuge.add(new Zug("ICE", 211));

        
        
    }

    public static String durchschnitt(ArrayList<Fahrzeug> alleFahrzeuge){
        int summe = 0;

        for (int i = 0; i < alleFahrzeuge.size(); i++) {
            Fahrzeug f = alleFahrzeuge.get(i);
            summe = summe + f.getGeschwindigkeit();
        }

        double durchschnitt = 0;
        if (alleFahrzeuge.size() > 0) {
            durchschnitt = (double) summe / alleFahrzeuge.size();
        }

        return "Durchschnittsgeschwindigkeit: "+durchschnitt+" km/h";

    }

    public static void langsamster(ArrayList<Fahrzeug> alleFahrzeuge){
        Fahrzeug f = alleFahrzeuge.get(1);
        for (int i = 2; i < alleFahrzeuge.size(); i++) {
            
            if (alleFahrzeuge.get(i).getGeschwindigkeit() < f.getGeschwindigkeit()) {
            f = alleFahrzeuge.get(i);
        }
        }

        System.out.println(f+" Ist das langsamste Fahrzeug");

    }
}
