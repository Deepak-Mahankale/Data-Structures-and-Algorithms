public class Solution {
    public static Node FindMiddle(Node head) {
        Node temp = new Node();
        temp.next = head;
        Node hear = temp;
        Node turrtle = temp;
        while (hear.next != null && hear.next.next != null) {
            turrtle = turrtle.next;
            hear = hear.next.next;
        }

        return turrtle;
    }

    public static Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node middle = FindMiddle(head);
        middle.next = middle.next.next;
        return head;
    }
}