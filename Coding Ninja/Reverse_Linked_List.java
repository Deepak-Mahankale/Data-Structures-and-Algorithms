public class Solution {
    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }
}