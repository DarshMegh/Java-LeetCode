package DynamicProgramming;

/*
 * Problem: 416. Partition Equal Subset Sum
 * Difficulty: Medium
 *
 * Time Complexity: O(n × target)
 * Space Complexity: O(target)
 */

public class _0416_PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        for (int num : nums) {

            for (int j = target; j >= num; j--) {

                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }
}