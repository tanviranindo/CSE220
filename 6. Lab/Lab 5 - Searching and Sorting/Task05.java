/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task05 {

    static Functions obj = new Functions();

    public static void main(String[] args) {
        System.out.println("--- INSERTION SORT IN DOUBLY LINKED LIST USING RECURSION ---");

//        int[] array = {57, 57, 86, 6, 99, 92, 8, 58, 47, 20, 54, 10, 43, 31, 83, 92}; //Auto Array Insertion
//        int[] array = obj.createArray(); //Manual Array Insertion
//        Node head = obj.arrayToList(array, null, null, 0, array.length); //Array to List Conversion

        //LINKED LIST is created and sorted using DOUBLY
        Node head = obj.createList(); //List Insertion

        System.out.print("\nInitial Elements Are    : ");
        obj.printList(head);

        insertionSort(head, head.next);

        System.out.print("After Insertion Sorting : ");
        obj.printList(head);
    }

    //Outer
    public static void insertionSort(Node head, Node index) {
        if (index != null) {
            int value = index.element;
            Node current = index.previous;
            current = inside(current, value);
            if (current == null) head.element = value;
            else current.next.element = value;
//            obj.printList(head); //For Debugging
            insertionSort(head, index.next);
        }
    }

    //Inner
    public static Node inside(Node current, int value) {
        if (current != null && current.element > value) {
            current.next.element = current.element;
            return inside(current.previous, value);
        }
        return current;
    }
}