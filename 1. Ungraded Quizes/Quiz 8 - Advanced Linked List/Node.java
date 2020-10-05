/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Node {
    public Object element;
    public Node previous;
    public Node next;

    public Node(Object e, Node p, Node n) {
        element = e;
        previous = p;
        next = n;
    }
}