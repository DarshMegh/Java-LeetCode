package DynamicProgramming;

/*
 * Problem: 509. Fibonacci Number
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _0509_FibonacciNumber {

    public int fib(int n) {

        if (n <= 1) {
            return n;
        }

        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {

            int current = first + second;
            first = second;
            second = current;
        }

        return second;
    }
}