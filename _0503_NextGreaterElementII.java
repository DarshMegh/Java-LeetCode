package MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

/*
 * Problem: 503. Next Greater Element II
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _0503_NextGreaterElementII {

    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            while (!stack.isEmpty() &&
                    nums[stack.peek()] < nums[index]) {

                result[stack.pop()] = nums[index];
            }

            if (i < n) {
                stack.push(index);
            }
        }

        return result;
    }
}