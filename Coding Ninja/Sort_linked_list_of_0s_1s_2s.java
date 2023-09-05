public class Solution {
    public static Node sortList(Node head) {
        int count0 = 0, count1 = 0, count2 = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                count0++;
                temp = temp.next;
            } else if (temp.data == 1) {
                count1++;
                temp = temp.next;
            } else {
                count2++;
                temp = temp.next;
            }
        }
        temp = head;
        while (temp != null) {
            if (count0 != 0) {
                temp.data = 0;
                count0--;
            } else if (count1 != 0) {
                temp.data = 1;
                count1--;
            } else if (count2 != 0) {
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }

        return head;
    }
}
