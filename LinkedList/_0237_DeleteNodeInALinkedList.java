package LinkedList;

/*
 * Problem: 237. Delete Node in a Linked List
 * Difficulty: Easy
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

public class _0237_DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }
}