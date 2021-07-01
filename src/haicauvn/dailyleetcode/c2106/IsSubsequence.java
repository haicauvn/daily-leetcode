package haicauvn.dailyleetcode.c2106;

/**
 * https://leetcode.com/problems/is-subsequence/
 */

public class IsSubsequence {
	public static void main(String[] args) {
		IsSubsequence solution = new IsSubsequence();
		System.out.println(solution.isSubsequence("aaaaaa", "bbaaaa"));
	}

	public boolean isSubsequence(String s, String t) {
		if (s.length() == 0) {
			return true;
		}
		if (s.length() > t.length()) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			int index = t.indexOf(s.charAt(i));
			if (index >= 0) {
				t = t.substring(index + 1, t.length());
			} else {
				return false;
			}
		}
		return true;
	}
}