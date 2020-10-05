/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class MergeandSort {
    public static void main(String[] args) {
        Node a5 = new Node(10, null);
        Node a4 = new Node(9, a5);
        Node a3 = new Node(5, a4);
        Node a2 = new Node(2, a3);
        Node headOne = new Node(1, a2);

        Node b5 = new Node(8, null);
        Node b4 = new Node(7, b5);
        Node b3 = new Node(6, b4);
        Node b2 = new Node(4, b3);
        Node headTwo = new Node(3, b2);

        Node mergedSort = Merge(headOne, headTwo);
        printNodeList(mergedSort);

    }

    public static void printNodeList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.next == null ? temp.element + "\n" : temp.element + ", ");
        }
    }

    public static Node Merge(Node X, Node Y) {
        int count = 0;
        for (Node i = X; i != null; i = i.next) count++;

        int index = 0;
        Node lastNode = null;

        for (Node i = X; i != null; i = i.next, index++) {
            if (index == count - 1) {
                lastNode = i;
                break;
            }
        }

        assert lastNode != null;
        lastNode.next = Y;

        for (Node i = X; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if ((int) i.element > (int) j.element) {
                    int temp = (int) i.element;
                    i.element = j.element;
                    j.element = temp;
                }
            }
        }
        return X;
    }
}
