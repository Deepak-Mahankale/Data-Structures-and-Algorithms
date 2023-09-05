public class Solution {
    public static Node removeKthNode(Node head, int K) {
        if (head == null || head.next == null) {
            return null;
        }

        int size = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (size == K) {
            return head.next;
        }
        Node prevs = head;
        for (int i = 1; i < size - K; i++) {
            prevs = prevs.next;
        }
        prevs.next = prevs.next.next;

        return head;

    }
}