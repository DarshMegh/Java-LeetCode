package Graph;

/*
 * Problem: 997. Find the Town Judge
 * Difficulty: Easy
 *
 * Time Complexity: O(n + trust.length)
 * Space Complexity: O(n)
 */

public class _0997_FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {

        int[] degree = new int[n + 1];

        for (int[] relation : trust) {
            degree[relation[0]]--;
            degree[relation[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (degree[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}