package Greedy;

import java.util.Arrays;

/*
 * Problem: 1710. Maximum Units on a Truck
 * Difficulty: Easy
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

public class _1710_MaximumUnitsOnATruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int units = 0;

        for (int[] box : boxTypes) {

            if (truckSize == 0) {
                break;
            }

            int boxes = Math.min(truckSize, box[0]);

            units += boxes * box[1];
            truckSize -= boxes;
        }

        return units;
    }
}