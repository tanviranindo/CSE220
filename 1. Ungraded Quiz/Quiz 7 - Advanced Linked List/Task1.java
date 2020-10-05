/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

import java.util.Scanner;
	
public class Task1 {

    public static void main(String[] args) {
        //Input Auto
        Node n5 = new Node(5, null);
        Node n4 = new Node(20, n5);
        Node n3 = new Node(30, n4);
        Node n2 = new Node(45, n3);
        Node head = new Node(64, n2);

        //Input Manual
//        Node head = inputList();
//        printNodeList(head);

        //Sorting
        Node sortedHead = ascendingSort(head);

        //Output
        printNodeList(sortedHead);
    }


    public static Node ascendingSort(Node head) {
        Node current = head, previous;
        int temp;

        if (head == null) return null;
        else {
            while (current != null) {
                previous = current.next;
                while (previous != null) {
                    if (current.element > previous.element) {
                        temp = current.element;
                        current.element = previous.element;
                        previous.element = temp;
                    }
                    previous = previous.next;
                }
                current = current.next;
            }
        }
        return head;
    }

    public static Node inputList() {
        Scanner input = new Scanner(System.in);
        Node listHead = new Node(input.nextInt(), null);
        for (int i = 0; i < 4; i++) listHead.next = new Node(input.nextInt(), listHead.next);
        return listHead;
    }

    public static void printNodeList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.next == null ? temp.element + "\n" : temp.element + ", ");
        }
    }
}

