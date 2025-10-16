package i;

public class Bogosort {
    
    public static void main(String[] args){
        int[] zahlen = {1,2,3,4,5,6};
        System.out.println(richtigSortiert(zahlen));
    }

    public static boolean richtigSortiert(int[] zahlen) {
        int i = 0;
        while (i < zahlen.length-1) {
            if (zahlen[i + 1] < zahlen[i]) {
                return false;
            } else {i++;}
        }
        return true;
    }
    
}
