package c;
import java.util.Arrays;

public class BubbleSortez {

    public static void main(String[] args){

        int[] array = new int[10];
        array[0] = 7;
        array[1] = 2;
        array[2] = 3;
        array[3] = 1;
        array[4] = 9;
        array[5] = 6;
        array[6] = 8;
        array[7] = 0;
        array[8] = 4;
        array[9] = 5;
        sort(array);
        System.out.println(array);

    }

    static void sort(int[] arr) {

        int a = 0;
        int x = 0;

        while (a < arr.length-1) {
            for (int i = 0; i < arr.length-1-a; i++) {
                if (arr[i] > arr[i + 1]) {
                    x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;

                }
                System.out.println(Arrays.toString(arr)); //Jeder Schritt

            }
            a++;
        }
    }

}