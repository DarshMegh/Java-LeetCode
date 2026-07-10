package Stack;

import java.util.Stack;

/*
 * Problem: 155. Min Stack
 * Difficulty: Medium
 *
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

public class _0155_MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public _0155_MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {

        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}