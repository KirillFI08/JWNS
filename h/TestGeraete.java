package h;
import java.util.ArrayList;
public class TestGeraete extends Licht{

    public TestGeraete(String name, String ort, boolean eingeschaltet, int helligkeit) {
        super(name, ort, eingeschaltet, helligkeit);
    }

    public static void main(String[] args) {

        ArrayList<Geraete> alleGeraete = new ArrayList<>();

        alleGeraete.add(new Licht("LED Lampe", "Wohnzimmer", true, 100));
        alleGeraete.add(new Licht("LCD Lampe", "Küche", true, 100));
        alleGeraete.add(new Licht("LED Lichterkette", "Schlafzimmer", false, 100));
        helligkeitändern(alleGeraete.get(1),-20);

        System.out.println(alleGeraete);

        
    }

}
