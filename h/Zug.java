package h;

public class Zug extends Fahrzeug{
    
public Zug(String name, int geschwindigkeit){
        super(name,geschwindigkeit);
    }
    
    public void fahren(){
        System.out.println("Der Zug fährt auf den Schinen");
    }
    public void anzahlRaeder(){
        System.out.println("Der Zug hat viele Räder");
    }
}
