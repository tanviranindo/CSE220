/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class BinaryTree {
    Object item;
    BinaryTree left;
    BinaryTree right;
    BinaryTree parent;

    public BinaryTree(Object value) {
        item = value;
        left = null;
        right = null;
    }

    public BinaryTree(Object i, BinaryTree l, BinaryTree r) {
        item = i;
        left = l;
        right = r;
    }

    public BinaryTree(Object i, BinaryTree l, BinaryTree r, BinaryTree p) {
        item = i;
        left = l;
        right = r;
        parent = p;
    }
}