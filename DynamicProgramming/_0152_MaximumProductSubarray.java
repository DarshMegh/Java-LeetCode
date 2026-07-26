package DynamicProgramming;

/*
 * Problem: 152. Maximum Product Subarray
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _0152_MaximumProductSubarray {

    public int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < 0) {

                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            answer = Math.max(answer, max);
        }

        return answer;
    }
}