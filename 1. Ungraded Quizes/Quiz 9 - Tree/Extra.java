public class Extra {
    public static void main(String[] args) {
//        Object[] arr = {null, 10, 5, 15, 2, 8, null, 20, null, 4, 6, null, null, null, 18};
//        Object[] arr = {null, 50, 30, 20, null, 40, null, 70, 60, null, 80};
//        BinaryTree tree = new BinaryTree();
        Object[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        BinaryTree root = treeBuilder(arr, 0);
//        System.out.println("Binary Tree Example");
//        System.out.println("Building tree with root value " + root.item);
//        insert(root, 2);
//        insert(root, 4);
//        insert(root, 8);
//        insert(root, 6);
//        insert(root, 7);
//        insert(root, 3);
//        insert(root, 9);
//        System.out.println("Traversing tree in order");
//
////        //RECURSIVELY calculates the height of a tree
//        System.out.println("Height of the tree: " + height(root));
////
//        //RECURSIVELY calculates the level of a Node in a tree
//        assert root != null;
//        System.out.println("Level of the tree: " + level(root.right.right.left));
////
//        //Prints elements of all the Nodes of a tree using In-order Traversal
        System.out.print("In order print: ");
        inOrderPrint(root);
        System.out.println();

        nodeCounter(root);
    }

//    public static void insert(BinaryTree node, int value) {
//        if (value < (int) node.item) {
//            if (node.left != null) {
//                insert(node.left, value);
//            } else {
////                System.out.println(" Inserted " + value + " to left of " + node.item);
//                node.left = new BinaryTree(value);
//            }
//        } else if (value > (int) node.item) {
//            if (node.right != null) {
//                insert(node.right, value);
//            } else {
////                System.out.println("  Inserted " + value + " to right of " + node.item);
//                node.right = new BinaryTree(value);
//            }
//        }
//    }


    public static BinaryTree treeBuilder(Object[] array, int i) {
        if (i < 0 || i >= array.length || array[i] == null) return null;
        else {
            BinaryTree root = new BinaryTree(array[i], null, null, null);
            BinaryTree left = treeBuilder(array, 2 * i + 1);
            BinaryTree right = treeBuilder(array, 2 * i + 2);
            root.left = left;
            root.right = right;
            if (left != null) left.parent = root;
            if (right != null) right.parent = root;
            return root;
        }
    }

    public static void nodeCounter(BinaryTree root) {
        int n = height(root);
        System.out.println("Number of Internal Nodes: " + n);
        System.out.println("Level: " + level(root));
        System.out.println("Number of External Nodes: " + (n + 1));
        System.out.println("Number of Total Nodes: " + (2 * n + 1));
    }

    //RECURSIVELY calculates the height of a tree
    public static int height(BinaryTree root) {
        return root == null ? 0 : 1 + check(height(root.left), height(root.right));
    }

    public static int check(int left, int right) {
        return Math.max(left, right);
    }

    //RECURSIVELY calculates the level of a Node in a tree
    public static int level(BinaryTree root) {
        return root == null ? -1 : root.parent == null ? 0 : 1 + level(root.parent);
    }

    //Prints elements of all the Nodes of a tree using In-order Traversal
    //RECURSIVELY prints all the elements of a binary search tree in a sorted order.
    public static void inOrderPrint(BinaryTree root) {
        if (root != null) {
            inOrderPrint(root.left);
            System.out.print(root.item + " ");
            inOrderPrint(root.right);
        }
    }
}