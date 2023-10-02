package haicauvn.dailyleetcode.array;

import java.util.Arrays;

/**
 * 1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number Tags: #array
 * #hashtable Difficulty: easy
 */
public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 })));
    }

    /**
     * Time : 1ms Time complexity: O(n)
     */
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counter = new int[101];
        int[] result = new int[nums.length];
        // Count the number of times each number appear
        for (int num : nums) {
            counter[num]++;
        }

        // Count total number of elemnts <= the number
        for (int i = 1; i < counter.length; i++) {
            counter[i] += counter[i - 1];
        }

        // Get total number of elements < the number
        for (int i = 0; i < result.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = counter[nums[i] - 1];
            }
        }
        return result;
    }
}
