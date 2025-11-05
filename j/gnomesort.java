import java.util.Random;

public class gnomesort {

    public static void main(String[] args) {
        int[] arr = {34, 2, 10, -9, 5, 3, 1, 9, 6, 8};
        
        System.out.println("Original array:");
        printArray(arr);
        
        gnomeSort(arr);
        System.out.println("Sorted array using Gnome Sort:");
        printArray(arr);
        
        int[] arr2 = {34, 2, 10, -9, 5, 3, 1, 9, 6, 8};
        bogosort(arr2);
        System.out.println("Sorted array using Bogosort:");
        printArray(arr2);
    }
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void gnomeSort(int[] arr) {
        int index = 0;
        int count =0;
        while (index < arr.length) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1]) {
                index++;
            } else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
            count++;
        }
        System.out.println("Gnome Sort completed in " + count + " operations.");
    } 

    public static void bogosort(int[] arr) {
        int count =0;
        while (!isSorted(arr)) {
            shuffle(arr);
            count++;    
        }
        System.out.println("Bogosort completed in " + count + " shuffles.");
    }

    private static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndexToSwap = rand.nextInt(arr.length);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
} 