package h;

public abstract class Fahrzeug {
    String name;
    int geschwindigkeit;
    int anzahlRaeder;

    public Fahrzeug(String name, int geschwindigkeit){
        this.name=name;
        this.geschwindigkeit=geschwindigkeit;
    }

    public abstract void fahren();
    public void info(){
        System.out.println("Fahrzeug: " + name + ", Geschwindigkeit: " + geschwindigkeit);
    }

    public abstract void anzahlRaeder();

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public int getAnzahlRaeder(){
        return anzahlRaeder;
    }

    public String toString() {
        return name + " (" + geschwindigkeit + " km/h)";
    }

}
