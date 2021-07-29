package haicauvn.dailyleetcode.array;

import java.util.ArrayList;
import java.util.List;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    // Approach 1: Time O(n) | Space O(1)
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean[] arr = new boolean[nums.length + 1];
        for (int i : nums) {
            arr[i] = true;
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == false) {
                result.add(i);
            }
        }
        return result;
    }
}
