class LinkedList {
    static int size;
    static Node head, tail;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.next = null;
            this.data = data;
        }

        Node() {
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    static void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size += 1;
        return;
    }

    static void insert(int val, int idx) {
        if (idx == 0) {
            addFirst(val);
            return;
        }
        if (idx == size) {
            addLast(val);
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size += 1;
        return;
    }

    static void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            addFirst(data);
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size += 1;
        return;

    }

    static int deleteFirst() {
        int r = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return r;
    }

    static int delete(int idx) {
        if (idx == 0) {
            return deleteFirst();
        }
        if (idx == size - 1) {
            return deleteLast();
        }
        Node prev = get(idx - 1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }

    static int deleteLast() {

        if (size <= 1) {
            deleteFirst();
        }
        Node curr = get(size - 1);
        int v = curr.data;
        tail = curr;
        tail.next = null;
        return v;

    }

    static Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    static Node get(int idx) {
        Node node = head;

        for (int i = 1; i < idx; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.addFirst(4);
        LL.addFirst(3);
        LL.addFirst(2);
        // LL.addFirst(10);
        // LL.addLast(50);
        // LL.addLast(60);
        // LL.addLast(70);
        // LL.insert(35, 3);
        // LL.insert(38, 4);
        // LL.display();
        // System.out.println();
        // System.out.println(find(30));
        // LL.display();
    }

    public static Node ADDD(Node head) {
        if (head == null)
            return head;
        Node dummy = new Node();
        Node temp = dummy;
        int carry = 0;
        int sum = 0;
        while (head != null) {
            sum = head.data + carry;
            carry = sum / 10;
            Node node = new Node(sum % 10);
            temp.next = node;
            temp = temp.next;
            head = head.next;
        }
        return dummy.next;
    }

}
