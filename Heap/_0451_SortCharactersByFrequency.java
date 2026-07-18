package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * Problem: 451. Sort Characters By Frequency
 * Difficulty: Medium
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

public class _0451_SortCharactersByFrequency {

    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        maxHeap.addAll(map.keySet());

        StringBuilder result = new StringBuilder();

        while (!maxHeap.isEmpty()) {

            char current = maxHeap.poll();

            for (int i = 0; i < map.get(current); i++) {
                result.append(current);
            }
        }

        return result.toString();
    }
}