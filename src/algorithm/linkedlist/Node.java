package algorithm.linkedlist;

public class Node<T> {

    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void print() {
        String printValue = "[ " + this.data + "] ";
        if (next != null) {
            printValue += "---> ";
        }
        System.out.print(printValue);
    }
}
