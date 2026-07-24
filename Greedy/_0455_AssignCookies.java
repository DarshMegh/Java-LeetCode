package Greedy;

import java.util.Arrays;

/*
 * Problem: 455. Assign Cookies
 * Difficulty: Easy
 *
 * Time Complexity: O(n log n + m log m)
 * Space Complexity: O(1)
 */

public class _0455_AssignCookies {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        while (child < g.length && cookie < s.length) {

            if (s[cookie] >= g[child]) {
                child++;
            }

            cookie++;
        }

        return child;
    }
}