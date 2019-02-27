package algorithm.linkedlist;

public class Test {

    public static void main(String[] args) {
        Node head1 = new Node(1);
        LinkedList list1 = new LinkedList(head1);
        list1.add(new Node(5));
        list1.add(new Node(1));
        list1.add(new Node(8));

        Node head2 = new Node(3);
        LinkedList list2 = new LinkedList(head2);
        list2.add(new Node(6));
        list2.add(new Node(9));
        list2.add(new Node(8));
        list2.add(new Node(7));

        Node head3 = LinkedListUtil.reverse(head1);
        Node head4 = LinkedListUtil.reverse(head2);

        TwoNumber twoNumber = new TwoNumber();
        Node head5 = twoNumber.add(head3, head4);
        head5 = LinkedListUtil.reverse(head5);
        LinkedListUtil.print(head5);
    }
}
