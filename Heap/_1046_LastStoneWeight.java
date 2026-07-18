package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * Problem: 1046. Last Stone Weight
 * Difficulty: Easy
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

public class _1046_LastStoneWeight {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while (maxHeap.size() > 1) {

            int first = maxHeap.poll();
            int second = maxHeap.poll();

            if (first != second) {
                maxHeap.offer(first - second);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}