package haicauvn.dailyleetcode.bitmanipulation;

import java.util.HashMap;
import java.util.Map;

public class _136_Single_Number {

    // Approach 2: BitManipulation
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    // Approach 1: HashTable
    public int singleNumber1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int i : nums) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] { 4, 1, 2, 1, 2 }));
    }

}
