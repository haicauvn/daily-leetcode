package haicauvn.dailyleetcode.array;

import java.util.ArrayList;
import java.util.List;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers2(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
    }

    // Approach 1: Time O(n) | Space O(n)
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean[] arr = new boolean[nums.length + 1];
        for (int i : nums) {
            arr[i] = true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == false) {
                result.add(i);
            }
        }
        return result;
    }

    // Approach 2: Time O(n) | Space O(1)
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int current = Math.abs(nums[i]) - 1;
            nums[current] = Math.abs(nums[current]) * (-1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
