package haicauvn.dailyleetcode.array;

public class _1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            max = temp > max ? temp : max;
        }
        return max;
    }
}
