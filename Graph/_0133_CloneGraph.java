package Graph;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem: 133. Clone Graph
 * Difficulty: Medium
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

public class _0133_CloneGraph {

    private Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }

        if (map.containsKey(node)) {
            return map.get(node);
        }

        Node clone = new Node(node.val);

        map.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }
}