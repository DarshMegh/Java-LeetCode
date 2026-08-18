package BitManipulation;

/*
 * Problem: 371. Sum of Two Integers
 * Difficulty: Medium
 *
 * Time Complexity: O(1) in Java's fixed-width integer model
 * Space Complexity: O(1)
 */

public class _0371_SumOfTwoIntegers {

    public int getSum(int a, int b) {

        while (b != 0) {

            int carry = (a & b) << 1;

            a = a ^ b;
            b = carry;
        }

        return a;
    }
}