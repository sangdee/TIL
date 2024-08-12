package algorithm.leetcode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root != null) {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        } else {
            return 0;
        }
    }
}
//9 -> 1 + 1
// 20 -> 1 + 1 + 1
