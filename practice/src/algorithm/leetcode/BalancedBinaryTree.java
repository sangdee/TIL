package algorithm.leetcode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }

    public int check(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int left = check(treeNode.left);
        if (left == -1) {
            return -1;
        }

        int right = check(treeNode.right);
        if (right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}
