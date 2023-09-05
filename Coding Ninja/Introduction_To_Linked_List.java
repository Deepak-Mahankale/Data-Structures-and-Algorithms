public class Solution {
    public static Node constructLL(int[] arr) {
        Node head = null;
        Node tail = null;
        for (int a : arr) {
            Node newNode = new Node(a);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }
}