public class Solution {
    public static Node deleteLastNode(Node head) {
        Node temp = head;
        if (temp.next == null) {
            return null;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}