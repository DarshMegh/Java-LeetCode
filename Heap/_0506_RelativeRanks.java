package Heap;

import java.util.PriorityQueue;

/*
 * Problem: 506. Relative Ranks
 * Difficulty: Easy
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

public class _0506_RelativeRanks {

    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] answer = new String[n];

        PriorityQueue<int[]> maxHeap =
                new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            maxHeap.offer(new int[]{score[i], i});
        }

        int rank = 1;

        while (!maxHeap.isEmpty()) {

            int[] current = maxHeap.poll();

            if (rank == 1) {
                answer[current[1]] = "Gold Medal";
            } else if (rank == 2) {
                answer[current[1]] = "Silver Medal";
            } else if (rank == 3) {
                answer[current[1]] = "Bronze Medal";
            } else {
                answer[current[1]] = String.valueOf(rank);
            }

            rank++;
        }

        return answer;
    }
}