package arrays;

/*
 * Problem: 27. Remove Element
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array nums and an integer val,
 * remove all occurrences of val in-place.
 * Return the number of elements that are not equal to val.
 *
 * Approach:
 * - Use a pointer to keep track of the position where the next
 *   non-val element should be placed.
 * - Traverse the array.
 * - If the current element is not equal to val,
 *   copy it to the current index pointer and increment the pointer.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _0027_RemoveElement {

    public int removeElement(int[] nums, int val) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}