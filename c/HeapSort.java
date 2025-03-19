package c;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7}; // Beispiel-Array

        System.out.println("Unsortiertes Array:");
        printArray(arr);

        heapSort(arr);  // Rufe Heap Sort auf

        System.out.println("Sortiertes Array:");
        printArray(arr);
    }





    // Die Methode, um ein Array in einen Max-Heap umzuwandeln
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;         // Setze den größten Wert als Wurzel
        int left = 2 * i + 1;    // Linkes Kind
        int right = 2 * i + 2;   // Rechtes Kind

        // Wenn das linke Kind größer ist als die Wurzel
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Wenn das rechte Kind größer ist als die Wurzel oder das linke Kind
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Wenn das größte Element nicht die Wurzel ist
        if (largest != i) {
            // Tausche die Wurzel mit dem größten Element
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Rekursiver Aufruf, um die betroffene Teilbaum-Hierarchie zu heapifyen
            heapify(arr, n, largest);
        }
    }

    // Die Hauptmethode für Heap Sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Baue den Max-Heap auf
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extrahiere Elemente aus dem Heap einen nach dem anderen
        for (int i = n - 1; i >= 0; i--) {
            // Verschiebe das aktuelle Root-Element (größtes Element) an das Ende
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify das reduzierte Heap
            heapify(arr, i, 0);
        }
    }

    // Eine Hilfsmethode zum Drucken des Arrays
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
}
