package h;

public class Test {
    Fahrzeug[] fahrzeuge = new Fahrzeug[3];

    public static void main(String[] args){
    Test test = new Test();
    test.fahrzeuge[0] = new Auto("BMW", 67);
    test.fahrzeuge[1] = new Fahrrad("I", 1);
    test.fahrzeuge[2] = new Auto("Audi", 160);
    }

    for(int i=0; i<fahrzeuge.length; i++){
        fahrzeuge[i].info();
    }
}
