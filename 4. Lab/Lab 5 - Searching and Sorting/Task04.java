/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task04 {

    static Functions obj = new Functions();

    public static void main(String[] args) {
        System.out.println("--- SELECTION SORT IN SINGLY LINKED LIST USING RECURSION ---");

//        int[] array = {57, 57, 86, 6, 99, 92, 8, 58, 47, 20, 54, 10, 43, 31, 83, 92}; //Auto Array Insertion
//        int[] array = obj.createArray(); //Manual Array Insertion
//        Node head = obj.arrayToList(array, null, null, 0, array.length); //Array to List Conversion

        //LINKED LIST is created using DOUBLY but sorted using SINGLY
         Node head = obj.createList(); //List Insertion

        System.out.print("\nInitial Elements Are    : ");
        obj.printList(head);

        selectionSort(head);

        System.out.print("After Selection Sorting : ");
        obj.printList(head);
    }

    //Outer
    public static void selectionSort(Node head) {
        if (head.next != null) {
            Node min = findMinimum(head, head.next);
            int temp = min.element;
            min.element = head.element;
            head.element = temp;
//            obj.printList(head); //For Debugging
            selectionSort(head.next);
        }
    }

    //Inner
    public static Node findMinimum(Node head, Node tail) {
        if (tail == null) return head;
        Node min = findMinimum(head, tail.next);
        return tail.element <= min.element ? tail : min;
    }
}


