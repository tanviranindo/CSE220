/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Tester {

    public static void main(String[] args) {
        Node n7 = new Node(70, null);
        Node n6 = new Node(60, n7);
        Node n5 = new Node(50, n6);
        Node n4 = new Node(40, n5);
        Node n3 = new Node(40, n4);
        Node n2 = new Node(20, n3);
        Node head = new Node(10, n2);

        System.out.print("Before Insertion: ");
        printNodeList(head);
        int size = 7;
        int value = 20;
        int index = 0;
        head = insert(head, size, value, index);
        System.out.println(value + " was successfully inserted at index " + index);
        System.out.print("After  Insertion: ");
        printNodeList(head);

    }

    public static void printNodeList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.next == null ? temp.element + "\n" : temp.element + ", ");
        }
    }

    public static Node nodeAt(Node head, int index) {
        if (index < 0) throw new IndexOutOfBoundsException();
        else {
            int count = 0;
            for (Node i = head; i != null; i = i.next) {
                if (count != index) count++;
                else return i;
            }
            return null;
        }
    }

    public static Node insert(Node head, int size, Object element, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        Node newNode = new Node(element, null);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node previous = nodeAt(head, index - 1);
            newNode.next = previous.next;
            previous.next = newNode;
        }
        return head;
    }
}
