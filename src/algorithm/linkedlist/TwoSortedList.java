package algorithm.linkedlist;

public class TwoSortedList {

    public Node merge(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        Node head = new Node(0);
        Node current = head;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if (head1 != null) {
            current.next = head1;
        } else if (head2 != null) {
            current.next = head2;
        }
        return head.next;
    }
}
