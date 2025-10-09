package h;

public class Licht extends Geraete {
    boolean eingeschaltet;
    int helligkeit;
    String name;
    String Ort;

    public Licht(String name, String ort, boolean eingeschaltet, int helligkeit){
        super(name, ort, eingeschaltet, helligkeit);
    }

    public static void helligkeitändern(Geraete Licht,int veränderung){
        Licht.helligkeit= Licht.helligkeit+veränderung;
    }


}
