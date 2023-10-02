package haicauvn.dailyleetcode.problems;

import java.util.Stack;

public class _20_Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (stack.lastElement().equals('{') && s.charAt(i) == '}') {
                stack.pop();
            } else if (stack.lastElement().equals('[') && s.charAt(i) == ']') {
                stack.pop();
            } else if (stack.lastElement().equals('(') && s.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.size() == 0;
    }
}
