package BitManipulation;

/*
 * Problem: 190. Reverse Bits
 * Difficulty: Easy
 *
 * Time Complexity: O(32)
 * Space Complexity: O(1)
 */

public class _0190_ReverseBits {

    public int reverseBits(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {

            result <<= 1;
            result |= (n & 1);

            n >>>= 1;
        }

        return result;
    }
}