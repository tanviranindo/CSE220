/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class LinkedList {

    public static void main(String[] args) {
        Node a5 = new Node(5, null);
        Node a4 = new Node(4, a5);
        Node a3 = new Node(3, a4);
        Node a2 = new Node(2, a3);
        Node headOne = new Node(1, a2);

        Node b5 = new Node(3, null);
        Node b4 = new Node(2, b5);
        Node b3 = new Node(10, b4);
        Node b2 = new Node(11, b3);
        Node headTwo = new Node(9, b2);

        printNodeList(headOne);
        printNodeList(headTwo);

        Node mergedHead = Add(headOne, headTwo);
        printNodeList(mergedHead);
    }

    public static Node Add(Node a, Node b) {
        Node head, tail;
        head = new Node(a.element + b.element, null);
        tail = head;
        for (Node h1 = a.next, h2 = b.next; h1 != null || h2 != null; h1 = h1.next, h2 = h2.next) {
            assert h1 != null;
            Node temp = new Node(h1.element + h2.element, null);
            tail.next = temp;
            tail = temp;
        }
        return head;
    }

    public static void printNodeList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.printf("%5s", temp.next == null ? temp.element + "\n" : temp.element);
        }
    }
}