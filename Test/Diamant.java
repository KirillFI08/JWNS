package Test;
public class Diamant {

    public static void main(String[] args){
        
        int c = 110;

        int d = 0;


        dAuf(d, c);
        dMi(c);
        dAb(c,d);


    }


    public static void dAuf(int c, int d){
        if(0<d){
            System.out.println("");

            for(int i = 0; i<d; i++){
                System.out.print(" ");
            }

            for(int i = 0; i<=c*2; i++){
                System.out.print("*");
            }

            dAuf(c+1, d-1);
        }

    }


    public static void dMi(int c){
 
        System.out.println("");

        for(int i = 0; i<c*2+1; i++){
            System.out.print("*");
        }
    
    }


    public static void dAb(int c, int d){

        if(0<c){
            System.out.println("");

            for(int i = 0; i<d+1; i++){
                System.out.print(" ");
            }

            for(int i = 1; i<c*2; i++){
                System.out.print("*");
            }

            dAb(c-1, d+1);
        }

    }

}
