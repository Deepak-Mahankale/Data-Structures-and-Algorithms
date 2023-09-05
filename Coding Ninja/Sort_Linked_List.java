public class Solution {
    public static Node findmid(Node head) {
        if (head == null) {
            return head;
        }
        Node fast = head;
        Node sloe = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            sloe = sloe.next;

        }
        return sloe;
    }

    public static Node Merge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        Node result = new Node(-1);
        Node temp = result;

        while (left != null && right != null) {
            if (left.data < right.data) {
                temp.next = left;
                temp = left;
                left = left.next;
            } else {
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }

        while (left != null) {
            temp.next = left;
            temp = left;
            left = left.next;
        }

        while (right != null) {
            temp.next = right;
            temp = right;
            right = right.next;
        }
        result = result.next;
        return result;
    }

    public static Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = findmid(head);

        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        Node ans = Merge(left, right);
        return ans;

    }
}