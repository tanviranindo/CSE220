/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Node {
    public int data;
    public Node next;
    public Node previous;


    public Node(int d, Node n, Node p) {
        data = d;
        next = n;
        previous = p;
    }
}