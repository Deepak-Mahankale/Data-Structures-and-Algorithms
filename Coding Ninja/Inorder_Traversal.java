import java.util.*;

public class Solution {
    static List<Integer> li = new ArrayList<>();

    public static List<Integer> getInOrderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        // getInOrderTraversal(root.left);
        // li.add(root.data);
        // getInOrderTraversal(root.right);
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while (true) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                if (st.isEmpty()) {
                    break;
                }
                curr = st.pop();
                li.add(curr.data);
                curr = curr.right;
            }
        }
        return li;
    }
}
