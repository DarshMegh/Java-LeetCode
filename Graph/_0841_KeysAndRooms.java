package Graph;

import java.util.List;

/*
 * Problem: 841. Keys and Rooms
 * Difficulty: Medium
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

public class _0841_KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean[] visited = new boolean[rooms.size()];

        dfs(rooms, visited, 0);

        for (boolean room : visited) {

            if (!room) {
                return false;
            }
        }

        return true;
    }

    private void dfs(List<List<Integer>> rooms,
                     boolean[] visited,
                     int room) {

        visited[room] = true;

        for (int key : rooms.get(room)) {

            if (!visited[key]) {
                dfs(rooms, visited, key);
            }
        }
    }
}