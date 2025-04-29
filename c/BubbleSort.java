package c;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){

        int[] array = {9,4,2,3,8,5,1,7,6};
        sort(array);
        System.out.println(Arrays.toString(array));

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
