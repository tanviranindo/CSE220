/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Node {
    public int element;
    public Node next;
    public Node previous;

    public Node(int e, Node n) {
        element = e;
        next = n;
    }

    public Node(int e, Node n, Node p) {
        element = e;
        next = n;
        previous = p;
    }
}