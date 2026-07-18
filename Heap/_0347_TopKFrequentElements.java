package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * Problem: 347. Top K Frequent Elements
 * Difficulty: Medium
 *
 * Time Complexity: O(n log k)
 * Space Complexity: O(n)
 */

public class _0347_TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> minHeap =
                new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

            minHeap.offer(new int[]{entry.getKey(), entry.getValue()});

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll()[0];
        }

        return result;
    }
}