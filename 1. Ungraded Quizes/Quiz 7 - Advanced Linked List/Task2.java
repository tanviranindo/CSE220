/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Task2 {

    public static void main(String[] args) {
        Node n7 = new Node(30, null);
        Node n6 = new Node(40, n7);
        Node n5 = new Node(50, n6);
        Node n4 = new Node(60, n5);
        Node n3 = new Node(30, n4);
        Node n2 = new Node(80, n3);
        Node head = new Node(90, n2);

        //Implemented rotateRight method
        System.out.print("Before Rotating To Right: ");
        printNodeList(head);
        Node rotatedRight = rotateRight(head);
        System.out.print("After  Rotating To Right: ");
        printNodeList(rotatedRight);
    }

    public static void printNodeList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.next == null ? temp.element + "\n" : temp.element + ", ");
        }
    }

    public static Node rotateRight(Node n) {
        Node previous = null;
        Node temp = n;

        while (temp.next != null) {
            previous = temp;
            temp = temp.next;
        }

        temp.next = n;
        n = temp;
        assert previous != null;
        previous.next = null;
        return n;
    }
}