public class Solution {
    public static Node deleteAllOccurrences(Node head, int k) {
        if (head == null || head.next == null) {
            return null;
        }
        while (head != null && head.data == k) {
            head = head.next;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.prev == null && temp.data == k) {
                temp = temp.next;
                temp.prev = null;
            } else if (temp.next == null && temp.data == k) {
                temp.prev.next = null;
            } else if (temp.data == k) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }

        return head;
    }
}