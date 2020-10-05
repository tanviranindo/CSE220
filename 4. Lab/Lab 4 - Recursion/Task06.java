import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.print("Number of elements: ");
        int size = input.nextInt();
        System.out.print("Insert the elements: ");
        Node head = list.iterate(null, size, 0);
        System.out.print("Addition: ");
        if (size != 1) printList(head);
        System.out.println(add(head));

        //CUSTOM TEST
//        Node e = new Node(6, null);
//        Node d = new Node(5, e);
//        Node c = new Node(4, d);
//        Node b = new Node(3, c);
//        Node a = new Node(2, b);
//        Node head = new Node(1, a);
//        System.out.println(add(head));
    }

    public static int add(Node n) {
        return n == null ? 0 : n.element + add(n.next);
    }

    public static void printList(Node head) {
        if (head != null) {
            System.out.print(head.next == null ? head.element + " = " : head.element + " + ");
            printList(head.next);
        }
    }
}