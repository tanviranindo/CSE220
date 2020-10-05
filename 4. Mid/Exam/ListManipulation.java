/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class ListManipulation {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 19, 2, -3, 5};
        Node head = build(array);
        print(head);
    }

    public static Node build(int[] A) {
        Node head = null, tail = null;
        for (int i = 0, j = 0; i < A.length; i++) {
            if (A[i] < A[0]) {
                if (j == 0) {
                    head = new Node(A[i], null);
                    tail = head;
                    j++;
                } else {
                    Node temp = new Node(A[i], null);
                    temp.previous = tail;
                    tail.next = temp;
                    tail = temp;
                }
            }
        }
        Node secondHead = null, secondTail = null;
        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                secondHead = new Node(A[0], null);
                secondTail = secondHead;
            } else {
                if (A[i] >= A[0]) {
                    Node temp = new Node(A[i], null);
                    temp.previous = secondTail;
                    secondTail.next = temp;
                    secondTail = temp;
                }
            }
        }
        int count = 0;
        for (Node i = head; i != null; i = i.next) count++;

        int index = 0;
        Node lastNode = null;

        for (Node i = head; i != null; i = i.next, index++) {
            if (index == count - 1) {
                lastNode = i;
                break;
            }
        }
        assert lastNode != null;
        lastNode.next = secondHead;
        secondHead.previous = lastNode;
        return head;
    }

    public static void print(Node head) {
        for (Node n = head; n != null; n = n.next) {
            System.out.print(n.element + " ");
        }
    }
}
