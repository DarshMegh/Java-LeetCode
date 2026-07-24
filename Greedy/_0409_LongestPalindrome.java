package Greedy;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem: 409. Longest Palindrome
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _0409_LongestPalindrome {

    public int longestPalindrome(String s) {

        Set<Character> set = new HashSet<>();

        int length = 0;

        for (char c : s.toCharArray()) {

            if (set.contains(c)) {

                set.remove(c);
                length += 2;

            } else {

                set.add(c);
            }
        }

        if (!set.isEmpty()) {
            length++;
        }

        return length;
    }
}