package algorithm.linkedlist;

public class LinkedListUtil {

    public static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node current = head;
        Node previous = null;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            temp.print();
            temp = temp.next;
        }
    }

    public static void newLine(){
        System.out.println();
    }
}
