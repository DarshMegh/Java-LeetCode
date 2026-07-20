package HashMap;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem: 202. Happy Number
 * Difficulty: Easy
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(log n)
 */

public class _0202_HappyNumber {

    public boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {

            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private int getNext(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}