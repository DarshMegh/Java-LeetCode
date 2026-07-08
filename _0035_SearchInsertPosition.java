package arrays;

/*
 * Problem: 35. Search Insert Position
 * Difficulty: Easy
 *
 * Description:
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be inserted.
 *
 * Approach:
 * - Use Binary Search.
 * - If target is found, return its index.
 * - Otherwise, return the position where it should be inserted.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class _0035_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}