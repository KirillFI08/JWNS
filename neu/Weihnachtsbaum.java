import java.util.Random;
public class Weihnachtsbaum {
    public static void main(String[] args) {
        Random random = new Random();
        int länge = 100;

        for (int l = 1; l<=länge; l++){
                int abstand = länge - l;

            for(int i=abstand; i>=0; i--){
            System.out.print(" ");
            }   

            int max = l*2;
            for(int i=1; i<max; i++){
                System.out.print("1");
                }

            System.out.println("");
        }


        if(länge<=6){
            int l = länge - 1;;
            for(int i = 0; i<l; i++){
                System.out.print(" ");
            }
            System.out.print("[ ]");
        }

        if(länge>6){
            int l = länge-2;
            for(int q = 0; q<2; q++){
            for(int i = 0; i<l; i++){
                System.out.print(" ");
            }
            System.out.print("[   ]");
        
            System.out.println("");
        }
        }

    }

}
