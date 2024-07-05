package Sorting;


public class SelectiveSorting {
    public static void main(String[] args) {
        int [] arr = {3,1,45,6,7,2};
        insertionSort(arr);
    }
    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min]> arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        traversing(arr);
    }
    private static void traversing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}