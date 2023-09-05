import java.util.ArrayList;
import java.util.Stack;
import javax.swing.tree.TreeNode;

public class Solution {
    public static void preOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            BinaryTreeNode curNode = st.pop();
            System.out.print(curNode.data + " ");
            if (curNode.right != null) {
                st.push(curNode.right);
            }
            if (curNode.left != null) {
                st.push(curNode.left);
            }
        }

    }

}