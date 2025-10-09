package i;

public abstract class Spieler {
    String name;
    int nummer;
    int alter;
    int tore;


    public Spieler(String name, int nummer, int alter, int tore){
        this.name = name;
        this.nummer = nummer;
        this.alter = alter;
        this.tore = tore;
    }
        
    public abstract String printInfo();

}
