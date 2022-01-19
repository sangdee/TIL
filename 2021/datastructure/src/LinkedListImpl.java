/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/25
 */
public class LinkedListImpl {

    private Node head;
    private int size;

    public LinkedListImpl() {
        head = null;
        size = 0;
    }

    public void add(Node newNode) {
        if (this.head == null) {
            this.head = new Node();
            this.head.setNext(newNode);
        } else {
            Node node = this.head;
            for (int i = 0; i < this.size; i++) {
                node = node.getNext();
            }
            node.setNext(newNode);
        }
        this.size++;
    }

    public void add(int index, Node newNode) {
        Node nextNode = null;
        if (index == 0) {
            if (this.head == null) {
                this.head = new Node();
                this.head.setNext(newNode);
            } else {
                newNode = this.head.getNext();
                newNode.setNext(newNode);
                this.head.setNext(newNode);
            }
        } else {
            if (index < 0 || index > this.size - 1) {
                throw new IndexOutOfBoundsException();
            }
            Node node = this.head;
            for (int i = 0; i < index - 1; i++) {

                node = node.getNext();

                if (index < this.size) {
                    nextNode = node.getNext();
                }

            }
            if (nextNode != null) {
                newNode.setNext(nextNode);
            }

            node.setNext(newNode);
        }
    }

    public void remove(int index) {
        Node headNode = this.head;
        if (headNode == null) {
            System.out.println("not found data");
        }
        Node node = headNode;

        for (int i = 0; i < index - 1; i++) {
            node = node.getNext();
        }
        node.setNext(node.getNext().getNext());
        this.size--;
    }

    public Node get() {
        if (this.head == null) {
            throw new IndexOutOfBoundsException();
        }
        Node node = this.head;

        for (int i = 0; i < this.size; i++) {
            node = node.getNext();
        }
        return node;
    }

    public int getSize() {
        return size;
    }

    class Node {

        private Node next;
        private Object data;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }
}
