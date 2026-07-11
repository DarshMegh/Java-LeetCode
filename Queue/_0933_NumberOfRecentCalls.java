package Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem: 933. Number of Recent Calls
 * Difficulty: Easy
 *
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

public class _0933_NumberOfRecentCalls {

    private Queue<Integer> queue;

    public _0933_NumberOfRecentCalls() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        queue.offer(t);

        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}