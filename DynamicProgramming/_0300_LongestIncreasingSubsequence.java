package DynamicProgramming;

import java.util.Arrays;

/*
 * Problem: 300. Longest Increasing Subsequence
 * Difficulty: Medium
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

public class _0300_LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        int[] dp = new int[nums.length];

        Arrays.fill(dp, 1);

        int answer = 1;

        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {

                if (nums[i] > nums[j]) {

                    dp[i] = Math.max(dp[i],
                            dp[j] + 1);
                }
            }

            answer = Math.max(answer, dp[i]);
        }

        return answer;
    }
}