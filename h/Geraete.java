package h;

public abstract class Geraete {
    String name;
    String ort;
    boolean eingeschaltet;
    int helligkeit;

    public Geraete(String name, String ort, boolean eingeschaltet, int helligkeit){
        this.name = name;
        this.ort=ort;
        this.eingeschaltet = eingeschaltet;
        this.helligkeit = helligkeit;

    }

    public String toString(){
        String an;
        if(eingeschaltet = true){
            an = "an";
        }else{
            an="aus";
        }
        return name + " in "+ort+" ist "+an+"  Helligkeit: "+helligkeit;

    }

}
