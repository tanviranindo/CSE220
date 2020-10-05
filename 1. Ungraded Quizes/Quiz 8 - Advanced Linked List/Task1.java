import java.util.Scanner;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */
	
public class Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        Node head = arrayToList(arr, null, null, 0, 4);
        printList(head);
        insertBefore(head, 3, 50);
        printList(head);
    }

    public static void insertBefore(Node head, Object oldElement, Object newElement) {
        boolean condition = true;
        for (Node current = head.next; current != head; current = current.next) {
            if (current.element.equals(oldElement)) {
                Node newNode = new Node(newElement, null, null);
                Node temporary = current.previous;
                newNode.previous = temporary;
                current.previous = newNode;
                temporary.next = newNode;
                newNode.next = current;
                condition = false;
                break;
            }
        }
        if (condition) System.out.println("I don't know where to insert the newElement!!");
    }

    public static Node arrayToList(int[] array, Node head, Node tail, int index, int size) {
        if (index != size) {
            Node newNode = new Node(array[index], null, null);
            if (head == null) {
                head = tail = newNode;
                head.previous = null;
            } else {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
            }
            tail.next = null;
            arrayToList(array, head, tail, index + 1, size);
        }
        return head;
    }

    public static void printList(Node head) {
        if (head != null) {
            System.out.print(head.next == null ? head.element + "\n" : head.element + ", ");
            printList(head.next);
        }
    }
}

