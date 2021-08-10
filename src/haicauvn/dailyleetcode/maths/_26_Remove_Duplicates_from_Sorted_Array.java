package haicauvn.dailyleetcode.maths;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class _26_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] { 1, 2 }));
        System.out.println(removeDuplicates(new int[] { 1, 2, 2 }));
        System.out.println(removeDuplicates(new int[] { 1, 1, 1 }));
        int[] arr = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        if (nums.length == 2) {
            if (nums[0] != nums[1]) {
                return 2;
            }
        }

        if (nums[0] == nums[nums.length - 1]) {
            return 1;
        }

        int p1 = 0;
        int p2 = 1;
        int lastValue = nums[p1];
        while (p2 < nums.length - 1) {
            while (p2 < nums.length - 1 && nums[p2] == lastValue) {
                p2++;
            }
            nums[p1++] = lastValue;
            lastValue = nums[p2];
        }
        if (nums[p2] != nums[p2 - 1]) {
            nums[p1] = nums[p2];
            return p1 + 1;
        } else {
            return p1;
        }
    }
}
