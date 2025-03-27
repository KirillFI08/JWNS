package c;
import java.util.Arrays;

public class StalinSort2 {

    public static void main(String[] args) {

        int arr[] = {34, 2, 10, 9, 7, 5};
        System.out.println("Unsorted array: " + Arrays.toString(arr));


        stalin(arr);

 
        System.out.println("Modified array with gaps: " + Arrays.toString(arr));
    }


    static void stalin(int[] arr) {
        int n = arr.length;

  
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                arr[i + 1] = -1; 
            }
        }
    }
}



