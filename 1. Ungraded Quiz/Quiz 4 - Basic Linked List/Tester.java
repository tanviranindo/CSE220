/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Tester{

    public static void main(String[] args) {
        Node n7 = new Node(70, null);
        Node n6 = new Node(60, n7);
        Node n5 = new Node(50, n6);
        Node n4 = new Node(40, n5);
        Node n3 = new Node(40, n4);
        Node n2 = new Node(20, n3);
        Node head = new Node(10, n2);

        System.out.print("List: ");
        printNodeList(head);
        
        Object element = 40;
        boolean contains = contains(head, element);
        System.out.println("\"" + element + "\"" + " is " + (contains ? "available": "not available") + " in the list.");

        System.out.print("Before Finding Duplicate: ");
        printNodeList(head);
        printDuplicate(head);

    }

    public static void printNodeList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.next == null ? temp.element + "\n" : temp.element + ", ");
        }
    }

    //Task 1
    public static boolean contains(Node n, Object element) {
        while (n != null) {
            if (n.element.equals(element)) return true;
            n = n.next;
        }
        return false;
    }

    //Task 2
    public static void printDuplicate(Node head) {
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.element.equals(j.element)) {
                    System.out.println("First Duplicate Element: " + i.element);
                    return;
                }
            }
        }
        System.out.println("Duplicate Element Not Found!");
    }
}
