package LinkedList;

/*
 * Problem: 160. Intersection of Two Linked Lists
 * Difficulty: Easy
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 */

public class _0160_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {

            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a;
    }
}