package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * Problem: 621. Task Scheduler
 * Difficulty: Medium
 *
 * Time Complexity: O(n log 26)
 * Space Complexity: O(26)
 */

public class _0621_TaskScheduler {

    public int leastInterval(char[] tasks, int n) {

        int[] frequency = new int[26];

        for (char task : tasks) {
            frequency[task - 'A']++;
        }

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int count : frequency) {
            if (count > 0) {
                maxHeap.offer(count);
            }
        }

        int time = 0;

        while (!maxHeap.isEmpty()) {

            int cycle = n + 1;

            int[] temp = new int[cycle];

            int index = 0;

            while (cycle > 0 && !maxHeap.isEmpty()) {

                int count = maxHeap.poll();

                if (count > 1) {
                    temp[index++] = count - 1;
                }

                cycle--;
                time++;
            }

            for (int i = 0; i < index; i++) {
                maxHeap.offer(temp[i]);
            }

            if (maxHeap.isEmpty()) {
                break;
            }

            time += cycle;
        }

        return time;
    }
}