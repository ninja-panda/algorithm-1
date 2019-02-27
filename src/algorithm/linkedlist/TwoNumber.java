package algorithm.linkedlist;

public class TwoNumber {

    public Node add(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node head = new Node(0);
        Node current = head;
        int advance = 0;
        while (head1 != null && head2 != null) {
            int sum = head1.data + head2.data + advance;
            advance = sum / 10;
            sum = sum % 10;
            current.next = new Node(sum);
            current = current.next;
            head1 = head1.next;
            head2 = head2.next;
        }

        if (head1 != null) {
            if (advance == 0) {
                current.next = head1;
            } else {
                current.next = add(head1, new Node<>(advance));
            }
        } else if (head2 != null) {
            if (advance == 0) {
                current.next = head2;
            } else {
                current.next = add(head2, new Node<>(advance));
            }
        }
        return head.next;
    }
}
