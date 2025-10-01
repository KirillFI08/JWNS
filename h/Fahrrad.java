package h;

public class Fahrrad extends Fahrzeug {
    String name = "Rennrad";
    int geschwindigkeit = 67;

    public Fahrrad(String name, int geschwindigkeit){
        super(name, geschwindigkeit);
    }

    public void fahren(){
        System.out.println("Es Fährt :(");
    }

}
