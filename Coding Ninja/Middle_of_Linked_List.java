public class Solution {
    public static Node findMiddle(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node hare = head;
        Node turr = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turr = turr.next;
        }
        return turr;
    }
}