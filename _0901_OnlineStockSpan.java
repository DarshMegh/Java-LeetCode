package MonotonicStack;

import java.util.Stack;

/*
 * Problem: 901. Online Stock Span
 * Difficulty: Medium
 *
 * Time Complexity: O(1) amortized per next() call
 * Space Complexity: O(n)
 */

public class _0901_OnlineStockSpan {

    private Stack<int[]> stack;

    public _0901_OnlineStockSpan() {
        stack = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        while (!stack.isEmpty() &&
                stack.peek()[0] <= price) {

            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});

        return span;
    }
}