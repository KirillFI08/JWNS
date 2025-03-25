package c;

import java.util.Arrays;

public class GnomeSort {
    public static void gnomeSort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (index == 0 || arr[index] >= arr[index - 1]) {
                index++;
            } else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {34, 2, 10, -9, 45, 3, 8};
        gnomeSort(array);
        System.out.println(Arrays.toString(array));
    }
}

