package Stack;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem: 225. Implement Stack using Queues
 * Difficulty: Easy
 *
 * Time Complexity:
 * Push - O(n)
 * Pop  - O(1)
 */

public class _0225_ImplementStackUsingQueues {

    private Queue<Integer> queue;

    public _0225_ImplementStackUsingQueues() {
        queue = new LinkedList<>();
    }

    public void push(int x) {

        queue.offer(x);

        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}