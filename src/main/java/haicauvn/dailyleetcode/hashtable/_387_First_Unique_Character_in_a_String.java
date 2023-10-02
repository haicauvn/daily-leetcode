package haicauvn.dailyleetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/submissions/
 * Difficulty: Easy
 * Tag: HashTable
 */

public class _387_First_Unique_Character_in_a_String {
    public static void main(String[] args) {

    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int value = map.get(s.charAt(i));
                map.put(s.charAt(i), value + 1);
            } else {
                map.put(s.charAt(i), 1);

            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
