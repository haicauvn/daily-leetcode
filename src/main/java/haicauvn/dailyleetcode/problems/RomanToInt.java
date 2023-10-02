package haicauvn.dailyleetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/
 * Difficulty: Easy
 */

public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt solution = new RomanToInt();
        TestCase[] testCases = {
                new TestCase("MM", 2000),
                new TestCase("III", 3),
                new TestCase("IV", 4),
                new TestCase("IX", 9),
                new TestCase("LVIII", 58),
                new TestCase("MCMXCIV", 1994)
        };

        for (TestCase testCase : testCases) {
            System.out.println(testCase.test(solution.romanToInt(testCase.input)));
        }

    }

    private static class TestCase {
        private String input;
        private int output;

        public TestCase(String input, int output) {
            this.input = input;
            this.output = output;
        }

        private boolean test(int output) {
            return this.output == output;
        }
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = map.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res = res - map.get(s.charAt(i));
            } else {
                res = res + map.get(s.charAt(i));
            }
        }
        return res;
    }
}
