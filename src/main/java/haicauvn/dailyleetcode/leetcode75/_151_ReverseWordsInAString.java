package haicauvn.dailyleetcode.leetcode75;

import java.util.Arrays;
import java.util.Collections;

public class _151_ReverseWordsInAString {

    public static String reverseWords(String s) {
        var reversedWords = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(reversedWords);
        return String.join(" ", reversedWords);
    }

}
