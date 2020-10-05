/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task03 {

    static Functions obj = new Functions();

    public static void main(String[] args) {
        System.out.println("--- BUBBLE SORT IN SINGLY LINKED LIST USING RECURSION ---");

//        int[] array = {57, 57, 86, 6, 99, 92, 8, 58, 47, 20, 54, 10, 43, 31, 83, 92}; //Auto Array Insertion
//        int[] array = obj.createArray(); //Manual Array Insertion
//        Node head = obj.arrayToList(array, null, null, 0, array.length); //Array to List Conversion

        //LINKED LIST is created using DOUBLY but sorted using SINGLY
        Node head = obj.createList(); //List Insertion

        System.out.print("\nInitial Elements Are : ");
        obj.printList(head);

        bubbleSort(head, obj.countNode(head, 0)); //head, size

        System.out.print("After Bubble Sorting : ");
        obj.printList(head);
    }

    //Outer
    public static void bubbleSort(Node head, int size) {
        if (size != 0) {
//            obj.printList(head); //For Debugging
            inside(head);
            bubbleSort(head, size - 1);
        }
    }

    //Inner
    public static void inside(Node head) {
        if (head.next != null) {
            if (head.element > head.next.element) {
                int temp = head.element;
                head.element = head.next.element;
                head.next.element = temp;
            }
            inside(head.next);
        }
    }
}


