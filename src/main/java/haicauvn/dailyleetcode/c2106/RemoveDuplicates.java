package haicauvn.dailyleetcode.c2106;

import java.util.Stack;

/**
 * June LeetCoding Challenge 2021
 * Week 4: June 22nd - June 28th
 * 1047. Remove All Adjacent Duplicates In String
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();
        String[] testcases = {"azxxzy", "azxxzyaaa", "bczaaaaaaa", "aababaab", "aaaaaaaa", "aaaaaaaaa", "abbbabaaa"};
        String[] results = {"ay", "aya", "bcza", "ba", "", "a", "ababa"};
        for (int i = 0; i < testcases.length; i++) {
            if (!solution.removeDuplicates(testcases[i]).equals(results[i])) {
                System.out.println("Wrong Answer");
                return;
            }
        }
        System.out.println("Accepted");
    }

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);

            // if stack is empty or the top element is not equal current character then push into the stack
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                // otherwise pop from the stack
                stack.pop();
            }
        }

        // convert the value of stack to String
        return stack.toString().replaceAll("\\[", "").replaceAll("\\]", "")
                .replaceAll(", ", "");
    }
}
