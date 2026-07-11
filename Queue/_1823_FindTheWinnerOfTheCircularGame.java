package Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem: 1823. Find the Winner of the Circular Game
 * Difficulty: Medium
 */

public class _1823_FindTheWinnerOfTheCircularGame {

    public int findTheWinner(int n, int k) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {

            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }

            queue.poll();
        }

        return queue.peek();
    }
}