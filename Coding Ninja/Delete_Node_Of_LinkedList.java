public class Solution {
    public static Node deleteLast(Node list) {
        int size = 0;
        Node temp = list;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        Node temp2 = list;
        for (int i = 0; i < size - 1; i++) {
            temp2 = temp2.next;
        }
        temp2.next = null;
        return list;
    }
}