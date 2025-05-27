public class Fakultaet2 {
    public static void main(String[] args){
        System.out.println(fakultaet(4));


    }

    public static int fakultaet(int n){
        int ergebnis = 1;
        for(int i = 1; i <= n; i++){
            ergebnis *= i;
        }
        return ergebnis;
    }

}
