package Test;

public class zahlenMitRekursion {

    public static void main(String[] args){
        zahl(1);
    }

    public static void zahl(int o){
        if(o<=100){
            System.out.println(o);
            zahl(o+1);
        }


    }

}
