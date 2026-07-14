package Tree;

/*
 * Problem: 235. Lowest Common Ancestor of a BST
 * Difficulty: Medium
 *
 * Time Complexity: O(h)
 * Space Complexity: O(1)
 */

public class _0235_LowestCommonAncestorOfABST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {

            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }

        return null;
    }
}