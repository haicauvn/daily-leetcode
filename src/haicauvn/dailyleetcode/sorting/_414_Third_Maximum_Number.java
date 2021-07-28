package haicauvn.dailyleetcode.sorting;

public class _414_Third_Maximum_Number {
    public static void main(String[] args) {
        // long[] arr = new long[] { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
        // insert(arr, 3);
        // insert(arr, 4);
        // insert(arr, 5);
        // insert(arr, 1);
        // insert(arr, 3);
        // insert(arr, 4);
        // insert(arr, 6);
        // insert(arr, 7);
        // insert(arr, 3);
        System.out.println(thirdMax(new int[] { 2, 2, 3, 1 }));
    }

    // private static void insertToRanking(long[] arr, int number) {
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == number) {
    //             return;
    //         }
    //     }
    //     if (number > arr[arr.length - 1]) {
    //         int i = arr.length - 1;
    //         while (i != 0 && number > arr[i - 1]) {
    //             arr[i] = arr[i - 1];
    //             i--;
    //         }
    //         arr[i] = number;
    //     }
    // }

    public static int thirdMax(int[] nums) {
        long[] arr = new long[] { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
        for (int number : nums) {
            boolean isExist = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == number) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist && number > arr[arr.length - 1]) {
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
