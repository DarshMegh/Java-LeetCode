package BitManipulation;

/*
 * Problem: 461. Hamming Distance
 * Difficulty: Easy
 *
 * Time Complexity: O(32)
 * Space Complexity: O(1)
 */

public class _0461_HammingDistance {

    public int hammingDistance(int x, int y) {

        int xor = x ^ y;
        int count = 0;

        while (xor != 0) {
            xor = xor & (xor - 1);
            count++;
        }

        return count;
    }
}