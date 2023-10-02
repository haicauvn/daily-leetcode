package haicauvn.dailyleetcode.array;

import java.util.Arrays;

public class _1089_Duplicate_Zeros {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(a);
        System.out.println(Arrays.toString(a));
    }

    public static void duplicateZeros(int[] arr) {
        // Count zeros
        int countZero = 0;
        for (int i : arr) {
            if (i == 0) {
                countZero++;
            }
        }

        // Pointer is the last element of the new Array what isn't trimed
        int pointer = (arr.length - 1) + countZero;

        // Set elements from end to start
        for (int i = arr.length - 1; i >= 0; i--) {
            if (pointer < arr.length) {
                arr[pointer] = arr[i];
            }
            pointer--;
            if (arr[i] == 0) {
                if (pointer < arr.length) {
                    arr[pointer] = arr[i];
                }
                pointer--;
            }
        }
    }
}
