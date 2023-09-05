
import javax.swing.tree.TreeNode;
import java.io.*;
import java.util.*;

public class Solution {
    public static ArrayList<Integer> zigzagTreeTraversal(TreeNode<Integer> root) {
        ArrayList<Integer> al = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode currNode = q.peek();
            if ((int) currNode.data == -1) {
                q.remove();
            } else {
                al.add((int) currNode.data);
                if ((int) currNode.left.data != -1) {
                    q.add(root.left);
                }
                if ((int) currNode.right.data != -1) {
                    q.add(root.right);
                }
            }
        }

        return al;
    }
}
