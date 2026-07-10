package Stack;

import java.util.Stack;

/*
 * Problem: 232. Implement Queue using Stacks
 * Difficulty: Easy
 *
 * Amortized Time Complexity: O(1)
 */

public class _0232_ImplementQueueUsingStacks {

    private Stack<Integer> input;
    private Stack<Integer> output;

    public _0232_ImplementQueueUsingStacks() {

        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {

        peek();

        return output.pop();
    }

    public int peek() {

        if (output.isEmpty()) {

            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.peek();
    }

    public boolean empty() {

        return input.isEmpty() && output.isEmpty();
    }
}