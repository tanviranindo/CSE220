/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class LinkedListUnion {
    public static Node headOne;
    public static Node headTwo;

    public static void main(String[] args) {
        Node n5 = new Node(9, null);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        headOne = n1;

        Node a5 = new Node(9, null);
        Node a4 = new Node(9, a5);
        Node a3 = new Node(8, a4);
        Node a2 = new Node(7, a3);
        Node a1 = new Node(6, a2);
        headTwo = a1;

        System.out.print("First Node: ");
        printNodeList(n1);
        System.out.print("Second Node: ");
        printNodeList(a1);

        Node h = union(n1, a1);
        System.out.print("After UNION: ");
        printNodeList(h);
    }

    public static void printNodeList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.next == null ? temp.element + "\n" : temp.element + ", ");
        }
    }

    public static Node removeDuplicate(Node head) {
        Node current = head;
        while (current != null) {
            Node temp = current;
            Node index = current.next;

            while (index != null) {
                if (current.element.equals(index.element)) temp.next = index.next;
                else temp = index;

                index = index.next;
            }
            current = current.next;
        }
        return head;
    }

    public static Node union(Node a, Node b) {
        Node head, tail;
        head = new Node(a.element, null);
        head.next = new Node(b.element, null);
        tail = head.next;
        for (Node h1 = a.next, h2 = b.next; h1 != null || h2 != null; h1 = h1.next, h2 = h2.next) {
            Node temp = new Node(h1.element, null);
            tail.next = temp;
            tail = temp;
            temp = new Node(h2.element, null);
            tail.next = temp;
            tail = temp;
        }
        head = removeDuplicate(head);
        return head;
    }
}
