package Sorting;

public class BubbleSort {
    public static void bubbleSorting(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean swapping = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapping = true;
                }
            }
            if (!swapping) {
                break;
            }
        }
        printing(arr);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printing(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println(); // add a newline at the end
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 83, 2, 2};
        int n = arr.length;
        bubbleSorting(arr, n);
    }
}