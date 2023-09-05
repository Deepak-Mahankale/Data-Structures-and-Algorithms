import java.util.*;

public class Solution {
    static List<Integer> li = new ArrayList<>();

    public static List<Integer> postorderTraversal(TreeNode<Integer> root) {

        if (root == null) {
            return li;
        }

        // postorderTraversal(root.left);
        // postorderTraversal(root.right);
        // li.add(root.data);

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);
        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.push(root);
            if (root.left != null) {
                st1.push(root.left);
            }
            if (root.right != null) {
                st1.push(root.right);
            }
        }
        while (!st2.isEmpty()) {
            li.add((int) st2.pop().data);
        }
        return li;

    }
}
