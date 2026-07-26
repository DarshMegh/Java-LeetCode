package DynamicProgramming;

/*
 * Problem: 198. House Robber
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _0198_HouseRobber {

    public int rob(int[] nums) {

        int prevTwo = 0;
        int prevOne = 0;

        for (int num : nums) {

            int current = Math.max(prevOne, prevTwo + num);

            prevTwo = prevOne;
            prevOne = current;
        }

        return prevOne;
    }
}
