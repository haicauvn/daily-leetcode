package haicauvn.dailyleetcode.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 1, 2, 4, 3, 6, 7, 9, 2, 1, 4 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while (j != 0 && current < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }
    }
}
