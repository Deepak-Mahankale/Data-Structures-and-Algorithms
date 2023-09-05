import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<Integer> inOrder = new ArrayList();
    static List<Integer> preOrder = new ArrayList();
    static List<Integer> postOrder = new ArrayList();

    public static List<Integer> Inorder(TreeNode root) {
        if (root == null) {
            return null;
        }
        Inorder(root.left);
        inOrder.add(root.data);
        Inorder(root.right);

        return inOrder;
    }

    public static List<Integer> preorder(TreeNode root) {
        if (root == null) {
            return null;
        }
        preOrder.add(root.data);
        preorder(root.left);
        preorder(root.right);

        return preOrder;
    }

    public static List<Integer> postorder(TreeNode root) {
        if (root == null) {
            return null;
        }

        postorder(root.left);
        postorder(root.right);
        postOrder.add(root.data);

        return postOrder;
    }

    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        inOrder = Inorder(root);
        preOrder = preorder(root);
        postOrder = postorder(root);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(inOrder);
        ans.add(preOrder);
        ans.add(postOrder);
        return ans;
    }
}
