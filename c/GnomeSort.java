package c;
import java.util.Arrays;



public class GnomeSort {
    // Function to perform Gnome Sort
    static void gnomeSort(int arr[]) {
        int index = 0;
        int n = arr.length;

        while (index < n) {
            if (index == 0 || arr[index] >= arr[index - 1]) {
                index++; // Move forward if sorted
            } else {
                // Swap if out of order
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                
                index--; // Move backward
            }
        }
    }

    // Driver method to test the sorting algorithm
    public static void main(String[] args) {
        int arr[] = {34, 2, 10, -9, 7, 5};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
    
        gnomeSort(arr);
    
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    
}



