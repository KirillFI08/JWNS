package c;
public class MergeSort {

    static void msort(int[] arr){

        int p=0;
        int r=arr.length;
        int q=arr.length/2;

        int[] arr1 = new int[r];
        int[] arr2 = new int[r];

        for(int i=p; i<q; i++){
            arr1[i] = arr[i];
        }

        for(int i=q; i<=r; i++){
            arr2[i-q] = arr[i];
        }

        if(arr1.length>1){
            msort(arr1);
        }

        if(arr2.length>1){
            msort(arr2);
        }
    }
}


