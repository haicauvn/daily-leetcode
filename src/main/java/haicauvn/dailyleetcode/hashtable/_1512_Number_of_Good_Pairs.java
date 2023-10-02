package haicauvn.dailyleetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * 1512. Number of Good Pairs
 * Tags: #array #hashtable
 * Difficulty: easy
 */

public class _1512_Number_of_Good_Pairs {

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3 }));
    }

    // 0ms
    // Time: O(n * k)
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> table = new HashMap<>();
        for (int num : nums) {
            if (table.containsKey(num)) {
                count += table.get(num);
                table.put(num, table.get(num) + 1);
            } else {
                table.put(num, 1);
            }
        }
        return count;
    }
}
