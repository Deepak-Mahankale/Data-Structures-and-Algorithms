public class Solution {
    public static Node insertAtTail(Node list, int K) {
        if (list == null) {
            Node node = new Node(K);
            list = node;
            return list;
        }
        Node temp = list;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(K);
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;

        return list;

    }

}