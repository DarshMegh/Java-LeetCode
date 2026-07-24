package Greedy;

/*
 * Problem: 134. Gas Station
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _0134_GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;

        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {

            totalGas += gas[i];
            totalCost += cost[i];

            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                start = i + 1;
                currentGas = 0;
            }
        }

        return totalGas >= totalCost ? start : -1;
    }
}
