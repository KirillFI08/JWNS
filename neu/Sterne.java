
public class Sterne {
    public static void main(String[] args) {
        int c = 3;
        sAb(c);

    }

    public static void sAb(int c){

        if (c <= 0) {
            return;
        }
        
        for (int i = 0; i < c; i++) {
            System.out.print("*");
        }
        System.out.println();
        sAb(c - 1);
        }
    

    public static void sAuf(int c){

        System.out.println("*");
        for(int i = 0; i<c; i++){

        }
    }
}


