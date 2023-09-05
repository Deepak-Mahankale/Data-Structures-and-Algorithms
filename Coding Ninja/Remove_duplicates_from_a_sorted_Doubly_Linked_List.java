public class Solution {
    static Node ans = new Node(-1);

    public static void answer(int s) {
        Node temp2 = ans;
        Node newNode = new Node(s);
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp.next = newNode;
        newNode.next = null;
        return;
    }

    public static Node uniqueSortedList(Node head) {
        Set<Integer> set = new HashSet<>();
        if (head == null) {
            return head;
        }
        Node temp = head.next.prev;
        while (temp != null) {
            set.add(temp.data);
            temp = temp.next;
        }
        for (int s : set) {
            answer(s);
        }
        return ans.next;
    }
}