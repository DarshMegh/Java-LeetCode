package Graph;

/*
 * Problem: 1791. Find Center of Star Graph
 * Difficulty: Easy
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

public class _1791_FindCenterOfStarGraph {

    public int findCenter(int[][] edges) {

        if (edges[0][0] == edges[1][0] ||
                edges[0][0] == edges[1][1]) {

            return edges[0][0];
        }

        return edges[0][1];
    }
}