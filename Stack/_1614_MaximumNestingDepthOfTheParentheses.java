package Stack;

/*
 * Problem: 1614. Maximum Nesting Depth of the Parentheses
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _1614_MaximumNestingDepthOfTheParentheses {

    public int maxDepth(String s) {

        int currentDepth = 0;
        int maxDepth = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }
}