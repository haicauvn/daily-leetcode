package haicauvn.dailyleetcode.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 1, 2, 4, 3, 6, 7, 9, 2, 1, 4 };
        bubbleSort(arr);
    }

    private static void printf(String text, int[] arr) {
        System.out.print(text + "\t : ");
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            printf("no" + i, arr);
            if (isSorted) {
                break;
            }
        }
    }
}
