package arrays;

/*
 * Problem: 26. Remove Duplicates from Sorted Array
 * Difficulty: Easy
 *
 * Description:
 * Given a sorted array nums, remove the duplicates in-place such that
 * each unique element appears only once. Return the number of unique elements.
 *
 * Approach:
 * - Use two pointers.
 * - One pointer keeps track of the last unique element.
 * - The other pointer scans the array.
 * - When a new unique element is found, place it next to the previous unique element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _0026_RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int index = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }

        return index + 1;
    }
}
