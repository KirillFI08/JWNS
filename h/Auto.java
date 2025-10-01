package h;

public class Auto extends Fahrzeug{
    String name = "Auto";
    int geschwindigkeit = 20;

    public Auto(String name, int geschwindigkeit){
        super(name, geschwindigkeit);
    }

    public void fahren(){ System.out.println("Es fährt");}


}
