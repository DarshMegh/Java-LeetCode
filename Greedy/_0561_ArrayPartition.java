package Greedy;

import java.util.Arrays;

/*
 * Problem: 561. Array Partition
 * Difficulty: Easy
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

public class _0561_ArrayPartition {

    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}