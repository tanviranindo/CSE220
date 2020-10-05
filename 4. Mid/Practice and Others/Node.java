/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Node {
    Object element;
    Practice.Node next;
    Practice.Node prev;

    public Node() {
    }

    public Node(Object element, Practice.Node next) {
        this.element = element;
        this.next = next;
    }

    public Node(Object element, Practice.Node next, Practice.Node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}