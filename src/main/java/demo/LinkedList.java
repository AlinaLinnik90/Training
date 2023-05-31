package demo;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
    }

    public void add(Integer data) {
        if (head == null) {
            head = new Node();
            head.setData(data);
            tail = head;
        } else {
            tail.setNext(new Node());
            tail = tail.getNext();
            tail.setData(data);
        }
        size++;
    }

    public Integer get(int index) {
        Node node;
        if (index >= size || index < 0) {
            return null;
        }

        node = head;
        for (int j = 0; j < index; j++) {
            node = node.getNext();
        }
        return node.getData();
    }

    public boolean delete(int index) {
        Node prv;
        Node nx;
        Node del;
        if (index >= size || index < 0) {
            return false;
        }
        prv = head;
        for (int i = 0; i < index - 1; i++) {
            prv = prv.getNext();
        }
        nx = head;
        for (int j = 0; j < index + 1; j++) {
            nx = nx.getNext();
        }
        del = prv.getNext();
        del.setNext(null);
        prv.setNext(nx);
        size--;

        return del.getNext() == null;
    }

    public Integer size() {
        if (head == null) {
            return null;
        }
        return size;
    }

    class Node {
        private Node next;
        private Integer data;

        public Node() {
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }
    }

}
