public class Solution {
    public static Node createTree(int[] arr) {
        int i = 0;
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.add(root);

        while (!q.isEmpty() && i < 3) {
            Node t = q.peek();
            q.poll();

            Node left = new Node(arr[2 * i + 1]);
            t.left = left;
            q.add(left);

            Node right = new Node(arr[2 * i + 2]);
            t.right = right;
            q.add(right);
            i++;
        }

        return root;
    }
}