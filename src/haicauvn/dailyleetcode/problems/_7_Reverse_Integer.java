package haicauvn.dailyleetcode.problems;

public class _7_Reverse_Integer {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        String str = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x>=0) ? Integer.parseInt(str) : Integer.parseInt(str) * (-1);
        } catch (Exception e) {
            return 0;
        }
    }
}
