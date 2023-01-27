public class DoublyLinkedList {
    class Node {
        int val;
        Node pre;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    Node head;
    Node tail;

    public void addHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
    }

    public void addToTail(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.pre = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

}