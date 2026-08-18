package BitManipulation;

/*
 * Problem: 191. Number of 1 Bits
 * Difficulty: Easy
 *
 * Time Complexity: O(32)
 * Space Complexity: O(1)
 */

public class _0191_NumberOf1Bits {

    public int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {

            n = n & (n - 1);
            count++;
        }

        return count;
    }
}