public class Solution {
    static Node head;

    static void InsertFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        return;
    }

    public static Node constructDLL(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            InsertFirst(arr[i]);
        }
        return head;
    }
}