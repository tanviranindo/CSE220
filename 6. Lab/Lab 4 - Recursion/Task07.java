import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.print("Number of elements: ");
        int size = input.nextInt();
        System.out.print("Insert the elements: ");
        Node head = list.iterate(null, size, 0);
        System.out.print("List Elements: ");
        printList(head);
        System.out.print("After Reversing: ");
        head = reverse(head);
        printList(head);

        //CUSTOM TEST
//        Node e = new Node(6, null);
//        Node d = new Node(5, e);
//        Node c = new Node(4, d);
//        Node b = new Node(3, c);
//        Node a = new Node(2, b);
//        Node head = new Node(1, a);
//        System.out.print("List Elements: ");
//        printList(head);
//        System.out.print("After Reversing: ");
//        head = reverse(head);
//        printList(head);
    }

    public static void printList(Node head) {
        if (head != null) {
            System.out.print(head.next == null ? head.element + "\n" : head.element + ", ");
            printList(head.next);
        }
    }

    public static Node reverse(Node head) {
        if (head.next == null) return head;
        else {
            Node temp = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return temp;
        }
    }
}