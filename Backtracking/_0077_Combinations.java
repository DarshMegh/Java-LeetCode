package Backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem: 77. Combinations
 * Difficulty: Medium
 *
 * Time Complexity: O(C(n,k))
 * Space Complexity: O(k)
 */

public class _0077_Combinations {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(1, n, k, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int start,
                           int n,
                           int k,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {

            current.add(i);

            backtrack(i + 1, n, k, current, result);

            current.remove(current.size() - 1);
        }
    }
}