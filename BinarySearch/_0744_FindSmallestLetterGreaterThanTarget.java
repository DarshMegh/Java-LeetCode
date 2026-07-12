package BinarySearch;

/*
 * Problem: 744. Find Smallest Letter Greater Than Target
 * Difficulty: Easy
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class _0744_FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return letters[left % letters.length];
    }
}