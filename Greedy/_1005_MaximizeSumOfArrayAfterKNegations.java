package Greedy;

import java.util.Arrays;

/*
 * Problem: 1005. Maximize Sum of Array After K Negations
 * Difficulty: Easy
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

public class _1005_MaximizeSumOfArrayAfterKNegations {

    public int largestSumAfterKNegations(int[] nums, int k) {

        Arrays.sort(nums);

        int i = 0;

        while (i < nums.length && k > 0 && nums[i] < 0) {
            nums[i] = -nums[i];
            i++;
            k--;
        }

        Arrays.sort(nums);

        if (k % 2 == 1) {
            nums[0] = -nums[0];
        }

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}