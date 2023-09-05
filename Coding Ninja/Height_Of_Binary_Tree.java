public class Solution {
    public static int heightOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftN = heightOfBinaryTree(root.left);
        int rightN = heightOfBinaryTree(root.right);
        int height = Math.max(leftN, rightN) + 1;

        return height;
    }
}