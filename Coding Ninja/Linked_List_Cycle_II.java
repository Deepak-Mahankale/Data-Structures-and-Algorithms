public class Solution {
    public static Node firstNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        Node entry = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}