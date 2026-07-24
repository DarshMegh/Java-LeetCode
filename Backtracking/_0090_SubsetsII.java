package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem: 90. Subsets II
 * Difficulty: Medium
 *
 * Time Complexity: O(n × 2ⁿ)
 * Space Complexity: O(n)
 */

public class _0090_SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int start,
                           int[] nums,
                           List<Integer> current,
                           List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {

            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            current.add(nums[i]);

            backtrack(i + 1, nums, current, result);

            current.remove(current.size() - 1);
        }
    }
}