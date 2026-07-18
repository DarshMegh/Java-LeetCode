package Heap;

import java.util.*;

/*
 * Problem: 692. Top K Frequent Words
 * Difficulty: Medium
 *
 * Time Complexity: O(n log k)
 * Space Complexity: O(n)
 */

public class _0692_TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> minHeap = new PriorityQueue<>(
                (a, b) -> {
                    if (map.get(a).equals(map.get(b))) {
                        return b.compareTo(a);
                    }
                    return map.get(a) - map.get(b);
                });

        for (String word : map.keySet()) {

            minHeap.offer(word);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        LinkedList<String> result = new LinkedList<>();

        while (!minHeap.isEmpty()) {
            result.addFirst(minHeap.poll());
        }

        return result;
    }
}