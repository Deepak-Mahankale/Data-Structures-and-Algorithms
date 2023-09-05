public class Solution {
    public static Node addNode(Node head) {
        if (head == null)
            return head;
        Node dummy = new Node();
        Node temp = dummy;
        int sum = 0;
        while (head != null) {
            sum = head.data + sum;
        }
        return dummy.next;
    }
}