package Test.Rentierrennen;

public class Rehntier {
    public String name;
    public int geschwindigkeit;
    public int ausdauer;

    public Rehntier(String name, int geschwindigkeit, int ausdauer) {
        this.name = name;
        this.geschwindigkeit = geschwindigkeit;
        this.ausdauer = ausdauer;
    }

    public static void main(String[] args) {
        Rehntier rehn1 = new Rehntier("Rudolf", 10, 5);
        Rehntier rehn2 = new Rehntier("Blitzen", 8, 8);
        Rehntier rehn3 = new Rehntier("Comet", 9, 6);
        Rehntier rehn4 = new Rehntier("Dasher", 7, 9);

        System.out.println("Rehntier 1: " + rehn1.name + ", Geschwindigkeit: " + rehn1.geschwindigkeit + ", Ausdauer: " + rehn1.ausdauer);
        System.out.println("Rehntier 2: " + rehn2.name + ", Geschwindigkeit: " + rehn2.geschwindigkeit + ", Ausdauer: " + rehn2.ausdauer);
        System.out.println("Rehntier 3: " + rehn3.name + ", Geschwindigkeit: " + rehn3.geschwindigkeit + ", Ausdauer: " + rehn3.ausdauer);
        System.out.println("Rehntier 4: " + rehn4.name + ", Geschwindigkeit: " + rehn4.geschwindigkeit + ", Ausdauer: " + rehn4.ausdauer);
    }
}
