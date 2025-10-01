import java.util.ArrayList;

public class Brett {
    public Brett(){
        Behaelter B1 = new Behaelter();
        Behaelter B2 = new Behaelter();
        Behaelter B3 = new Behaelter();
        Behaelter B4 = new Behaelter();

        Hindernis H6 = new Hindernis(B3, B4);
        Hindernis H5 = new Hindernis(B2, B3);
        Hindernis H4 = new Hindernis(B1,B2);

        Hindernis H3 = new Hindernis(H5, H6);
        Hindernis H2 = new Hindernis(H4, H5);

        start = new Hindernis(H2, H3);

    }

    public void simuliere(){
        Knoten k = start;
        while(k != null){
            k=k.verarbeite();
        }
    }

}
