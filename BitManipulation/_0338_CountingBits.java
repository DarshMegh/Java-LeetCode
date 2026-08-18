package BitManipulation;

/*
 * Problem: 338. Counting Bits
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _0338_CountingBits {

    public int[] countBits(int n) {

        int[] result = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            result[i] = result[i >> 1] + (i & 1);
        }

        return result;
    }
}