public class DoublyLL {
    Node head;

    class Node {
        Node next, prev;
        int data;

        Node(int data) {
            this.data = data;
        }

        Node(Node next, Node prev, int data) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insert(int val, int idx) {
        Node node = findNode(val);
        if (node == null) {
            insertFirst(val);
        }
        Node newN = new Node(val);
        newN.next = node.next;
        node.next = newN;
        newN.prev = node;
        if (node.next != null) {
            node.next.prev = newN;
        }

    }

    public void insertLast(int data) {
        Node temp = head;
        Node newNode = new Node(data);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
    }

    public Node findNode(int val) {
        Node node = head;
        if (node == null) {
            return null;
        }
        while (node.next != null) {
            if (node.data == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node node = head;
        Node last = null;
        ;
        while (node != null) {
            System.out.print(node.data + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Print in Reverse");
        while (last != null) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("END");

    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insertFirst(40);
        dll.insertFirst(30);
        dll.insertFirst(20);
        dll.insertFirst(10);
        dll.insertLast(50);
        dll.insert(15, 2);
        dll.display();

    }

}
