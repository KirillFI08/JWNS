package c;

public class SelectionSort {

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
        int x = arr[1];

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < x) {
                    x = arr[i];

                }
            }

            arr[j] = x;
        }
        
    }

}
