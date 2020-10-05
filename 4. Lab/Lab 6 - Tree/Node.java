/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Node {
    Object item;
    Node left;
    Node right;
    Node parent;

    public Node(Object i, Node l, Node r) {
        item = i;
        left = l;
        right = r;
    }

    public Node(Object i, Node l, Node r, Node p) {
        item = i;
        left = l;
        right = r;
        parent = p;
    }
}