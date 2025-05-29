public class DezBin {
    public static void main(String[] args){
        int n = 3;
        System.out.println(inBin(n));
    }

    public static String inBin(int n){
        if (n == 0) return "0";
        if (n == 1) return "1";
        return inBin(n / 2) + (n % 2);
    }
}
