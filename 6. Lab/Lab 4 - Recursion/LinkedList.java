import java.util.Scanner;

public class LinkedList {
    static Scanner input = new Scanner(System.in);
    public Node head;

    public Node iterate(Node head, int size, int index) {
        return index == size ? head : iterate(insert(head, size, input.nextInt(), index), size, index + 1);
    }

    public Node insert(Node head, int size, int element, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        Node temp = new Node(element, null);
        if (index == 0) {
            temp.next = head;
            head = temp;
        } else {
            Node previous = nodeAt(head, 0, index - 1);
            temp.next = previous.next;
            previous.next = temp;
        }
        return head;
    }

    public Node nodeAt(Node head, int size, int index) {
        if (index < 0) throw new IndexOutOfBoundsException();
        else return index >= size ? head : nodeAt(head.next, size, index + 1);
    }
}