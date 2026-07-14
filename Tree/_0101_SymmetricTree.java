package Tree;

/*
 * Problem: 101. Symmetric Tree
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _0101_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val &&
                isMirror(left.left, right.right) &&
                isMirror(left.right, right.left);
    }
}