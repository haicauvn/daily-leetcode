package haicauvn.dailyleetcode.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * 677. Map Sum Pairs
 * Difficulty: Medium
 * Daily Leetcoding Challenge Jul - 2021
 */
public class _677_Map_Sum_Pairs {
    public static void main(String[] args) {

    }

    private Map<String, Integer> map;

    public _677_Map_Sum_Pairs() {
        this.map = new HashMap<>();
    }

    public void insert(String key, int val) {
        if (map.containsKey(key)) {
            map.replace(key, val);
        } else {
            map.put(key, val);
        }
    }

    public int sum(String prefix) {
        Set<String> keySet = map.keySet();
        int sum = 0;
        for (String key : keySet) {
            if (key.startsWith(prefix)) {
                sum += map.get(key);
            }
        }
        return sum;
    }
}
