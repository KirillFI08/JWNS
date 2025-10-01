package h;

public abstract class Fahrzeug {
    String name;
    int geschwindigkeit;

    public Fahrzeug(String name, int speed) {
        this.name = name;
        this.geschwindigkeit = geschwindigkeit;
    }

    public abstract void fahren();
    public String info(){
        return "Fahrzeug: "+name+", Geschwindigkeit: "+geschwindigkeit;
    }

    


}
