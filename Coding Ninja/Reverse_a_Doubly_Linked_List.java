public class Solution {
    public static Node reverseDLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prevs = head;
        Node curr = head.next;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prevs;
            curr.prev = nextNode;

            prevs = curr;
            curr = nextNode;
        }

        head.next = null;
        head = prevs;

        return head;

    }
}
