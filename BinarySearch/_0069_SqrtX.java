package BinarySearch;

/*
 * Problem: 69. Sqrt(x)
 * Difficulty: Easy
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class _0069_SqrtX {

    public int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }

            if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}