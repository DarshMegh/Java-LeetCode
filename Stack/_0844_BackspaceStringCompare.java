package Stack;

import java.util.Stack;

/*
 * Problem: 844. Backspace String Compare
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _0844_BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {

        return build(s).equals(build(t));
    }

    private String build(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {

            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();

        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}