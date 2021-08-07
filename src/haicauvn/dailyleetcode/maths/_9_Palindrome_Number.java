package haicauvn.dailyleetcode.maths;

public class _9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int originNumber = x;
        int reverseNumber = 0;
        while (x > 0) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x /= 10;
        }
        return originNumber == reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(124));
        System.out.println(isPalindrome(125));
        System.out.println(isPalindrome(-124));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(145541));
        System.out.println(isPalindrome(124421));
    }

    public static boolean IsPalindrome(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by
        // revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x =
        // 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to
        // itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
