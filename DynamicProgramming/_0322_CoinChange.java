package DynamicProgramming;

import java.util.Arrays;

/*
 * Problem: 322. Coin Change
 * Difficulty: Medium
 *
 * Time Complexity: O(amount × coins)
 * Space Complexity: O(amount)
 */

public class _0322_CoinChange {

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {

                if (coin <= i) {

                    dp[i] = Math.min(dp[i],
                            dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}