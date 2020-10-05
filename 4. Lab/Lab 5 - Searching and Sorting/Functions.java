import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Functions {

    Scanner input = new Scanner(System.in);

    /*------------------------Array-------------------------------*/

    public int[] createArray() {
        System.out.print("\nEnter Array Size  : ");
        int size = input.nextInt();

        if (size <= 0) throw new IndexOutOfBoundsException();
        else {
            int[] array = new int[size];
            System.out.print("Insert " + size + " elements : ");
            insertElementForArray(array, 0, size);
            return array;
        }
    }

    public int[] insertElementForArray(int[] array, int index, int size) {
        if (index < size) {
            array[index] = input.nextInt();
            return insertElementForArray(array, index + 1, size);
        }
        return array;
    }

    public void printArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(index + 1 == array.length ? array[index] + "\n" : array[index] + ", ");
            printArray(array, index + 1);
        }
    }

    /*------------------------Linked List-------------------------------*/
    public Node createList() {
        System.out.print("\nEnter List Size   : ");
        int size = input.nextInt();

        if (size <= 0) throw new IndexOutOfBoundsException();
        else {
            System.out.print("Insert " + size + " elements : ");
            return insertElementForLinkedList(null, null, 0, size);
        }
    }

    public int countNode(Node head, int count) {
        return head != null ? countNode(head.next, count + 1) : count;
    }

    public Node insertElementForLinkedList(Node head, Node tail, int index, int size) {
        if (index != size) {
            Node newNode = new Node(input.nextInt(), null, null);
            if (head == null) {
                head = tail = newNode;
                head.previous = null;
            } else {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
            }
            tail.next = null;
            insertElementForLinkedList(head, tail, index + 1, size);
        }
        return head;
    }

    public Node arrayToList(int[] array, Node head, Node tail, int index, int size) {
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

    public void printList(Node head) {
        if (head != null) {
            System.out.print(head.next == null ? head.element + "\n" : head.element + ", ");
            printList(head.next);
        }
    }
}
