/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class BinaryTree {
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Object[] arr1 = {null, 10, 5, 15, 2, 8, null, 20, null, 4, 6, null, null, null, 18};

        Node root = treeBuilder(arr, 1);
        Node root1 = treeBuilder(arr1, 1);

        //RECURSIVELY calculates the height of a tree
        System.out.println("Height of the tree: " + height(root));

        //RECURSIVELY calculates the level of a Node in a tree
        assert root != null;
        System.out.println("Level of the tree: " + level(root.right.right.left));

        //Prints elements of all the Nodes of a tree using Pre-order Traversal
        System.out.print("Pre order print: ");
        preOrderPrint(root);
        System.out.println();

        //Prints elements of all the Nodes of a tree using In-order Traversal
        System.out.print("In order print: ");
        inOrderPrint(root);
        System.out.println();

        //Print elements of all the Nodes of a tree using Post-order Traversal
        System.out.print("Post order print: ");
        postOrderPrint(root);
        System.out.println();

        //Evaluates whether two trees are exactly same or not
        System.out.println("Same root: " + same(root, root1));

        //Returns a copy (new tree) of a given tree
        Node copied = copyTree((root));
        System.out.print("Copied Tree: ");
        inOrderPrint(copied);
        System.out.println();

        //RECURSIVELY searches and finds an integer from a given binary search tree (BST)
        int element = 0;
        System.out.println("Element " + element + (findNode(root, element) ? " found" : " not found"));

        //RECURSIVELY prints all the elements of a binary search tree in a sorted order.
        System.out.print("Sort Order: ");
        inOrderPrint(root);
        System.out.println();

    }
//    public static Node add(Node current, Object value) {
//        if (current == null) return new Node(value);
//        if ((int) value < (int) current.item) current.left = add(current.left, value);
//        else if ((int) value > (int) current.item) current.right = add(current.right, value);
//        else return current;
//        return current;
//    }

    public static Node treeBuilder(Object[] array, int i) {
        if (i < 0 || i >= array.length || array[i] == null) return null;
        else {
            Node root = new Node(array[i], null, null, null);
            Node left = treeBuilder(array, 2 * i);
            Node right = treeBuilder(array, 2 * i + 1);
            root.left = left;
            root.right = right;
            if (left != null) left.parent = root;
            if (right != null) right.parent = root;
            return root;
        }
    }

    //RECURSIVELY calculates the height of a tree
    public static int height(Node root) {
        return root == null ? 0 : 1 + check(height(root.left), height(root.right));
    }

    public static int depth(Node root) {
        if (isRoot(root)) return 0;
        else return 1 + depth(root.parent);
    }

    public static boolean isRoot(Node root) {
        return root.parent == null;
    }

    public static int check(int left, int right) {
        return Math.max(left, right);
    }

    //RECURSIVELY calculates the level of a Node in a tree
    public static int level(Node root) {
        return root == null ? -1 : root.parent == null ? 0 : 1 + level(root.parent);
    }

    //Prints elements of all the Nodes of a tree using Pre-order Traversal
    public static void preOrderPrint(Node root) {
        if (root != null) {
            System.out.print(root.item + " ");
            preOrderPrint(root.left);
            preOrderPrint(root.right);
        }
    }

    //Prints elements of all the Nodes of a tree using In-order Traversal
    //RECURSIVELY prints all the elements of a binary search tree in a sorted order.
    public static void inOrderPrint(Node root) {
        if (root != null) {
            inOrderPrint(root.left);
            System.out.print(root.item + " ");
            inOrderPrint(root.right);
        }
    }

    //Print elements of all the Nodes of a tree using Post-order Traversal
    public static void postOrderPrint(Node root) {
        if (root != null) {
            postOrderPrint(root.left);
            postOrderPrint(root.right);
            System.out.print(root.item + " ");
        }
    }

    //Evaluates whether two trees are exactly same or not
    public static boolean same(Node r1, Node r2) {
        return r1 == null || r2 == null ? r1 == null && r2 == null : r1.item.equals(r2.item) && same(r1.left, r2.left) && same(r1.right, r2.right);
    }

    //Returns a copy (new tree) of a given tree
    public static Node copyTree(Node root) {
        return root == null ? null : new Node(root.item, copyTree(root.left), copyTree(root.right));
    }

    //RECURSIVELY searches and finds an integer from a given binary search tree (BST)
    public static boolean findNode(Node root, int key) {
        if (root != null) {
            if ((int) root.item == key) return true;
            if ((int) root.item > key) return findNode(root.left, key);
            return findNode(root.right, key);
        }
        return false;
    }
}