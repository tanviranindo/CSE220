/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class LinkedListIntersection {
    public static Node headOne;
    public static Node headTwo;

    public static void main(String[] args) {
        Node n5 = new Node(8, null);
        Node n4 = new Node(6, n5);
        Node n3 = new Node(4, n4);
        Node n2 = new Node(3, n3);
        Node n1 = new Node(1, n2);
        headOne = n1;

        Node a5 = new Node(8, null);
        Node a4 = new Node(5, a5);
        Node a3 = new Node(2, a4);
        Node a2 = new Node(2, a3);
        Node a1 = new Node(1, a2);
        headTwo = a1;

        System.out.print("First Node: ");
        printNodeList(n1);
        System.out.print("Second Node: ");
        printNodeList(a1);

        Node h = intersection(n1, a1);
        System.out.print("After INTERSECTION: ");
        printNodeList(h);
    }

    public static void printNodeList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.next == null ? temp.element + "\n" : temp.element + ", ");
        }
    }

    public static Node intersection(Node a, Node b) {
        Node head = null;
        Node tail = null;
        for (Node i = a; i != null; i = i.next) {
            for (Node j = b; j != null; j = j.next) {
                if (i.element.equals(j.element)) {
                    if (head == null) {
                        head = i;
                        tail = i;
                    } else {
                        tail.next = i;
                        tail = i;
                    }
                }
            }
        }
        return head;
    }
}
