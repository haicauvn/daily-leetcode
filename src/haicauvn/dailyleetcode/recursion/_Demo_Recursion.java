package haicauvn.dailyleetcode.recursion;

public class _Demo_Recursion {
    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    private static int fibo(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }

    private static void printArray(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }

    private static void printArrayReverse(int[] arr, int index) {
        if(index < 0 || index >= arr.length) {
            return;
        }
        printArrayReverse(arr, index + 1);
        System.out.println(arr[index]);
    }
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
        System.out.println("fibo 10: " + fibo(10));
        printArray(new int[]{3,4,5,6,7,8,9}, 0);
        printArrayReverse(new int[]{3,4,5,6,7,8,9}, 0);
    }
}
