package haicauvn.dailyleetcode.sorting;

import java.util.Arrays;

public class _414_Third_Maximum_Number {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 2, 3, 1 };
        long[] arr = new long[] { 0, 0, 0 };
        insert(arr, -1);
        insert(arr, 4);
        insert(arr, 2);
        insert(arr, 1);
        insert(arr, 6);
        insert(arr, 7);
        insert(arr, 8);
        System.out.println(Arrays.toString(arr));
        // System.out.println(thirdMax(nums));
    }

    private static void insert(long[] arr, int number) {
        // Find the position be inserted
        int k = arr.length - 1;
        if (number < arr[k]) {
            return;
        }
        while (k > 0) {
            if (number > arr[k - 1]) {
                k--;
            } else {
                break;
            }
        }

        // Insert
        for(int i = arr.length -1; i > k; i--) {
            arr[i] = arr[i-1];
        }
        arr[k] = number;
    }

    public static int thirdMax(int[] nums) {
        long[] arr = new long[] { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
        for (int number : nums) {
            // Check exist number in the ranking
            boolean isExist = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == number) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                continue;
            }

            // Insert to ranking
            if (number > arr[arr.length - 1]) {
                int i = arr.length - 1;
                while (i != 0 && number > arr[i - 1]) {
                    arr[i] = arr[i - 1];
                    i--;
                }
                arr[i] = number;
            }
        }
        return (arr[2] > Long.MIN_VALUE) ? (int) arr[2] : (int) arr[0];
    }
}
