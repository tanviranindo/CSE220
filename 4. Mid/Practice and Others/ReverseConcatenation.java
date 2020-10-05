/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class ReverseConcatenation {

    public static void main(String[] args) {
        Node n5 = new Node(9, null);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        Node a5 = new Node(9, null);
        Node a4 = new Node(9, a5);
        Node a3 = new Node(8, a4);
        Node a2 = new Node(7, a3);
        Node a1 = new Node(6, a2);

        System.out.print("First Node: ");
        printNodeList(n1);
        System.out.print("Second Node: ");
        printNodeList(a1);
        Node newN = concat(n1, a1);
        printNodeList(newN);
    }

    public static void printNodeList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.next == null ? temp.element + "\n" : temp.element + ", ");
        }
    }

    public static int countNode(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static Node nodeAt(Node head, int idx) {
        Node temp = head;
        int count = 0;
        while (temp != null) {

            if (count == idx) {
                break;
            }
            temp = temp.next;
            count++;
        }
        return temp;
    }

    public static Node concat(Node a, Node b) {
        a = reverseList(a);
        b = reverseList(a);
        Node newNode = nodeAt(a, countNode(a) - 1);
        newNode.next = b;
        return a;
    }

    public static Node reverseList(Node head) {
        Node reverseNode = new Node(head.element, null);
        for (Node n = head.next; n != null; n = n.next) {
            reverseNode = new Node(n.element, reverseNode);
        }
        return reverseNode;
    }
}

