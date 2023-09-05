public class CircularLL {
    Node head, tail;

    CircularLL() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    public void InsertL(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        return;

    }

    public void display() {
        Node tep = head;
        do {
            System.out.print(tep.val + " -> ");
            tep = tep.next;
        } while (tep != head);

    }

    public static void main(String[] args) {
        CircularLL cl = new CircularLL();
        cl.InsertL(50);
        cl.InsertL(40);
        cl.InsertL(30);
        cl.InsertL(20);
        cl.InsertL(10);
        cl.display();
    }
}
