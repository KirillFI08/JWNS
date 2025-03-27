package c;
import java.util.Arrays;
public class StalinSort {

    public static void main(String[] args){

        int arr[] = {34, 2, 10, 9, 7, 5};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
    
        stalin(arr);
    
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }






    @SuppressWarnings("null")
    static void stalin(int[] arr){
        int index = 0;
        int n = arr.length;
        int[] arr2 = new int[n];
        int index2 = 0;
        int n2 = arr2.length;

        while(index<n-1){
            if(arr[index]<arr[index+1]){
                index++;
            }
            if(arr[index]>arr[index+1]){
                arr2[index2] = arr[index];
                arr[index] = -1;
                index2++;
                index++;

            }
            




        }
    }


}

