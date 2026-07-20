package HashMap;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem: 349. Intersection of Two Arrays
 * Difficulty: Easy
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n)
 */

public class _0349_IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {

            if (set.contains(num)) {
                result.add(num);
            }
        }

        int[] answer = new int[result.size()];
        int index = 0;

        for (int num : result) {
            answer[index++] = num;
        }

        return answer;
    }
}