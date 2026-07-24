package Backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem: 78. Subsets
 * Difficulty: Medium
 *
 * Time Complexity: O(n × 2ⁿ)
 * Space Complexity: O(n)
 */

public class _0078_Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int index,
                           int[] nums,
                           List<Integer> current,
                           List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            current.add(nums[i]);

            backtrack(i + 1, nums, current, result);

            current.remove(current.size() - 1);
        }
    }
}