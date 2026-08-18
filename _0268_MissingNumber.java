package BitManipulation;

/*
 * Problem: 268. Missing Number
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _0268_MissingNumber {

    public int missingNumber(int[] nums) {

        int result = nums.length;

        for (int i = 0; i < nums.length; i++) {

            result ^= i;
            result ^= nums[i];
        }

        return result;
    }
}