import java.util.HashMap;

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        Node temp = firstHead;
        Node temp2 = secondHead;
        HashMap<Node, Integer> maps = new HashMap<>();
        while (temp != null) {
            maps.put(temp, temp.data);
            temp = temp.next;
        }
        while (temp2 != null) {
            if (maps.containsKey(temp2)) {
                return temp2.data;
            }
            temp2 = temp2.next;
        }

        return -1;

    }
}
