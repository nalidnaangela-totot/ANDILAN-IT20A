import java.util.Arrays;

public class sortingAlgorithms {
     public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] original = {64, 25, 12, 22, 11, 90, 5, 77, 33, 1};

        
        int[] bubbleArr = original.clone();
        int[] selectionArr = original.clone();
        int[] insertionArr = original.clone();

        bubbleSort(bubbleArr);
        selectionSort(selectionArr);
        insertionSort(insertionArr);

        System.out.println("Original Array:                    " + Arrays.toString(original));
        System.out.println("Sorted Array using bubble sort:    " + Arrays.toString(bubbleArr));
        System.out.println("Sorted Array using selection sort: " + Arrays.toString(selectionArr));
        System.out.println("Sorted Array using insertion sort: " + Arrays.toString(insertionArr));
    }
}


