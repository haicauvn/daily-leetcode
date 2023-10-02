package haicauvn.dailyleetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        TestCase[] testCases = {
                new TestCase(new int[]{3, 2, 3}, 6, new int[]{0, 2}),
                new TestCase(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                new TestCase(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                new TestCase(new int[]{3, 3}, 6, new int[]{0, 1}),
                new TestCase(new int[]{5, 75, 25}, 100, new int[]{1, 2})
        };
        for (TestCase testCase : testCases) {
            if (!testCase.test(solution.twoSum(testCase.nums, testCase.target))) {
                System.out.println("Wrong answer");
                System.out.println("Input: " + Arrays.toString(testCase.nums));
                System.out.println("Output: " + Arrays.toString(solution.twoSum(testCase.nums, testCase.target)));
                System.out.println("Expected: " + Arrays.toString(testCase.result));
                return;
            }
            ;
        }
        System.out.println("Accepted");
    }

    private static class TestCase {
        private int[] nums;
        private int target;
        private int[] result;

        private TestCase(int[] nums, int target, int[] result) {
            this.nums = nums;
            this.target = target;
            this.result = Arrays.copyOfRange(result, 0, result.length);
        }

        private boolean test(int[] arr) {
            return Arrays.equals(arr, result);
        }
    }

//    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        int[] temp = Arrays.copyOfRange(nums, 0, nums.length);
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            int[] subnums = Arrays.copyOfRange(nums, i + 1, nums.length);
//            int index = Arrays.binarySearch(subnums, target - nums[i]);
//            if (index >= 0) {
//                result[0] = i;
//                result[1] = index + i + 1;
//                break;
//            }
//        }
//
//        int a = 0;
//
//        for (int i = 0; i < temp.length; i++) {
//            if (temp[i] == nums[result[0]]) {
//                a = i;
//                break;
//            }
//            if (temp[i] == nums[result[1]]) {
//                a = i;
//                break;
//            }
//        }
//
//        for (int i = a + 1; i < temp.length; i++) {
//            if (temp[i] == nums[result[1]] || temp[i] == nums[result[0]]) {
//                result[1] = i;
//                result[0] = a;
//                break;
//            }
//        }
//
//        return result;
//    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
