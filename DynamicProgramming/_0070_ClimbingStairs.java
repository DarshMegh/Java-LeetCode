package DynamicProgramming;

/*
 * Problem: 70. Climbing Stairs
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _0070_ClimbingStairs {

    public int climbStairs(int n) {

        if (n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {

            int current = first + second;
            first = second;
            second = current;
        }

        return second;
    }
}