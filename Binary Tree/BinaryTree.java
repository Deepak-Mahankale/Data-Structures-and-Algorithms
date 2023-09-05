import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static int idx = -1;

    static Node ContructTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = ContructTree(nodes);
        newNode.right = ContructTree(nodes);
        return newNode;
    }

    static void PreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        PreOrder(root.left);
        PreOrder(root.right);
        return;
    }

    static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.val + " ");
        InOrder(root.right);
        return;
    }

    static void PostOrder(Node root) {
        if (root == null) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.val + " ");
        return;
    }

    static void LevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.val + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    static int CountNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = CountNodes(root.left);
        int rightNode = CountNodes(root.right);

        return leftNode + rightNode + 1;
    }

    static int SumofNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = SumofNodes(root.left);
        int rightNode = SumofNodes(root.right);

        return leftNode + rightNode + root.val;
    }

    static int HeightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = HeightOfTree(root.left);
        int rightNode = HeightOfTree(root.right);

        int Myheight = Math.max(leftNode, rightNode) + 1;

        return Myheight;
    }

    static int Diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int LD = Diameter(root.left);
        int RD = Diameter(root.right);
        int D3 = HeightOfTree(root.left) + HeightOfTree(root.right) + 1;

        return Math.max(D3, Math.max(LD, RD));
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, -1 };
        Node root = ContructTree(nodes);
        /*
         * System.out.print("PreOrder: ");
         * PreOrder(root);
         * System.out.println();
         * 
         * System.out.print("InOrder: ");
         * InOrder(root);
         * System.out.println();
         * 
         * System.out.print("PostOrder: ");
         * PostOrder(root);
         * System.out.println();
         * 
         * System.out.println("LevelOrder: ");
         * LevelOrder(root);
         * System.out.println();
         */
        // System.out.println(CountNodes(root));
        // System.out.println(SumofNodes(root));
        // System.out.println(HeightOfTree(root));
        System.out.println(Diameter(root));

    }
}

class Node {
    Node left, right;
    int val;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
