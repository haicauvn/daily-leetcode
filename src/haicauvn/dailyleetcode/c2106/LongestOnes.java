package haicauvn.dailyleetcode.c2106;

/**
 * June LeetCoding Challenge 2021
 * Week 5: June 29th - June 30th
 * Max Consecutive Ones III
 * 1004
 */

public class LongestOnes {
    public static void main(String[] args) {
        LongestOnes solution = new LongestOnes();
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(solution.longestOnes(arr, k));
    }

    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int p1 = 0, p2 = 0;
        int res = 0;
        while (p2 < n) {
            if (nums[p2] == 0) {
                if (k == 0) {
                    while (nums[p1] != 0) {
                        p1++;
                    }
                    p1++;
                } else {
                    k--;
                }
            }
            p2++;
            res = Math.max(res, p2 - p1);
        }
        return res;
    }
}
