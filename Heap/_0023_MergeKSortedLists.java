package Heap;

import java.util.PriorityQueue;

/*
 * Problem: 23. Merge k Sorted Lists
 * Difficulty: Hard
 *
 * Time Complexity: O(N log k)
 * Space Complexity: O(k)
 */

public class _0023_MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> minHeap =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!minHeap.isEmpty()) {

            ListNode node = minHeap.poll();

            current.next = node;
            current = current.next;

            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }

        return dummy.next;
    }
}