package DynamicProgramming;

/*
 * Problem: 494. Target Sum
 * Difficulty: Medium
 *
 * Time Complexity: O(n × target)
 * Space Complexity: O(target)
 */

public class _0494_TargetSum {

    public int findTargetSumWays(int[] nums, int target) {

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if ((sum + target) % 2 != 0 || Math.abs(target) > sum) {
            return 0;
        }

        int subset = (sum + target) / 2;

        int[] dp = new int[subset + 1];

        dp[0] = 1;

        for (int num : nums) {

            for (int j = subset; j >= num; j--) {

                dp[j] += dp[j - num];
            }
        }

        return dp[subset];
    }
}