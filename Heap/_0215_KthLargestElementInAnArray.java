package Heap;

import java.util.PriorityQueue;

/*
 * Problem: 215. Kth Largest Element in an Array
 * Difficulty: Medium
 *
 * Time Complexity: O(n log k)
 * Space Complexity: O(k)
 */

public class _0215_KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}