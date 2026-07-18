package Heap;

import java.util.PriorityQueue;

/*
 * Problem: 703. Kth Largest Element in a Stream
 * Difficulty: Easy
 *
 * Time Complexity: O(log k)
 * Space Complexity: O(k)
 */

public class _0703_KthLargestElementInAStream {

    private PriorityQueue<Integer> minHeap;
    private int k;

    public _0703_KthLargestElementInAStream(int k, int[] nums) {

        this.k = k;
        minHeap = new PriorityQueue<>();

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {

        minHeap.offer(val);

        if (minHeap.size() > k) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}