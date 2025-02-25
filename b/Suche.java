package b;

import java.util.Random;
import java.util.Arrays;

public class Suche {

    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();
        

        int count = 0;
        int avgcount = 0;
        while(avgcount<100){
        while (count < 100) {
            int r = random.nextInt(1000) + 1;
            

            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (array[i] == r) {
                    exists = true;
                    break;
                }
            }
            
            if (!exists) {
                array[count] = r;
                count++;
            }
        }

        int r = random.nextInt(100)+1;
        System.out.println(array[r]);
        for(int i=0; i<100; i++){
            if(array[i]==array[r]){
                System.out.println("Es waren "+i+" Versuche");

            }
        }
        avgcount++;


    }
    System.out.println(Arrays.toString(array));
}
