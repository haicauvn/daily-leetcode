package haicauvn.dailyleetcode.array;

/**
 * 1295. Find Numbers with Even Number of Digits
 * tag: array
 */
public class _1295_Find_Numbers_Even_Number_of_Digits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12345}));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (var i : nums) {
            if (numsDigits(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int numsDigits(int number) {
        int count = 0;
        for (; number > 0; number /= 10, count++) ;
        return count;
    }
}
