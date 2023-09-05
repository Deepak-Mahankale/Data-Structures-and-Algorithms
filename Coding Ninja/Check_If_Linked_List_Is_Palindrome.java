public class Solution {
    public static Node RevserS(Node head) {
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head.next = null;
        head = prev;

        return head;
    }

    public static Node FindM(Node temp) {
        Node hear = temp;
        Node turrtle = temp;
        while (hear.next != null && hear.next.next != null) {
            hear = hear.next.next;
            turrtle = turrtle.next;
        }
        return turrtle;
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node middle = FindM(head);
        Node secondHalf = RevserS(middle.next);
        Node firstNode = head;
        while (secondHalf != null) {
            if (secondHalf.data != firstNode.data) {
                return false;
            }
            secondHalf = secondHalf.next;
            firstNode = firstNode.next;
        }
        return true;

    }
}