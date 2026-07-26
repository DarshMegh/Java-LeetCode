package DynamicProgramming;

/*
 * Problem: 213. House Robber II
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _0213_HouseRobberII {

    public int rob(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        return Math.max(
                robRange(nums, 0, nums.length - 2),
                robRange(nums, 1, nums.length - 1));
    }

    private int robRange(int[] nums, int start, int end) {

        int prevTwo = 0;
        int prevOne = 0;

        for (int i = start; i <= end; i++) {

            int current = Math.max(prevOne, prevTwo + nums[i]);

            prevTwo = prevOne;
            prevOne = current;
        }

        return prevOne;
    }
}