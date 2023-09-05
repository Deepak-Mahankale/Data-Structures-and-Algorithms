public class Solution {
    public static Node insertAtFirst(Node list, int newValue) {
        Node newNode = new Node(newValue);
        newNode.next = list;
        list = newNode;
        return list;
    }
}