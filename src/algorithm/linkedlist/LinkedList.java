package algorithm.linkedlist;

public class LinkedList {

    private Node head;

    public LinkedList(Node node) {
        this.head = node;
    }

    public void add(Node node) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
}
