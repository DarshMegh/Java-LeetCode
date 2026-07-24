package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem: 40. Combination Sum II
 * Difficulty: Medium
 *
 * Time Complexity: Exponential
 * Space Complexity: O(target)
 */

public class _0040_CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, target, candidates, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int start,
                           int target,
                           int[] candidates,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (target == 0) {

            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            current.add(candidates[i]);

            backtrack(i + 1,
                    target - candidates[i],
                    candidates,
                    current,
                    result);

            current.remove(current.size() - 1);
        }
    }
}