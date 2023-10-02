package haicauvn.dailyleetcode.array;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 * difficulty: Easy
 * tag: array
 */
public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        merge(nums1, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (var i : nums2) {
            insertNumber(nums1, i, m);
            m++;
        }
    }

    private static void insertNumber(int[] nums, int k, int m) {
        for (int i = 0; i < m; i++) {
            if (nums[i] > k) {
                for (int j = m; j > i; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[i] = k;
                return;
            }
        }
        nums[m] = k;
    }
}
