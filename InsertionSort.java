package Sorting;
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {3,7,5,2,1};
        insertionSort(arr);

    }
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int current = arr[i];
          int  j = i - 1;
          while (j>=0 && current < arr[j]){
              arr[j+1] = arr[j];
              j--;
          }
          arr[j+1] = current;
        }
        traversing(arr);
    }
    private static void traversing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}