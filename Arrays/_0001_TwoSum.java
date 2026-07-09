package arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem: 1. Two Sum
 * Difficulty: Easy
 *
 * Description:
 * Given an array of integers nums and an integer target,
 * return the indices of the two numbers such that they add up to target.
 *
 * Approach:
 * - Traverse the array once.
 * - Store each number and its index in a HashMap.
 * - Before storing the current number, check if its complement
 *   (target - current number) already exists in the map.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _0001_TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
