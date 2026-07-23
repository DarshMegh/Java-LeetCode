package Graph;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem: 994. Rotting Oranges
 * Difficulty: Medium
 *
 * Time Complexity: O(m × n)
 * Space Complexity: O(m × n)
 */

public class _0994_RottingOranges {

    public int orangesRotting(int[][] grid) {

        Queue<int[]> queue = new LinkedList<>();

        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }

        int minutes = 0;

        int[][] directions = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };

        while (!queue.isEmpty() && fresh > 0) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int[] current = queue.poll();

                for (int[] dir : directions) {

                    int nr = current[0] + dir[0];
                    int nc = current[1] + dir[1];

                    if (nr >= 0 &&
                            nr < grid.length &&
                            nc >= 0 &&
                            nc < grid[0].length &&
                            grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        fresh--;
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}