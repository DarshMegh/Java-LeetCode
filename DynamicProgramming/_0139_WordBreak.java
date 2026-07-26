package DynamicProgramming;

import java.util.List;

/*
 * Problem: 139. Word Break
 * Difficulty: Medium
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

public class _0139_WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() + 1];

        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {

            for (int j = 0; j < i; j++) {

                if (dp[j] &&
                        wordDict.contains(s.substring(j, i))) {

                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}