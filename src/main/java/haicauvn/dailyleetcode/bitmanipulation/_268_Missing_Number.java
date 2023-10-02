package haicauvn.dailyleetcode.bitmanipulation;

import java.util.HashSet;
import java.util.Set;

public class _268_Missing_Number {
    public static void main(String[] args) {
        System.out.println(missingNumber2(new int[] { 2, 0 }));
    }

    // Approach 1: Hash Set | Time O(n) | Space O(n)
    public static int missingNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    // Appraoch 2: Bit Manipulation | Time O(n) | Space O(1)
    public static int missingNumber2(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= i;
            result ^= nums[i];
        }
        result ^= nums.length;
        return result;
    }
}
