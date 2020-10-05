/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task01 {

    static Functions obj = new Functions();

    public static void main(String[] args) {
        System.out.println("--- SELECTION SORT IN ARRAY USING RECURSION ---");

//        int[] array = {57, 57, 86, 6, 99, 92, 8, 58, 47, 20, 54, 10, 43, 31, 83, 92}; //Auto Insertion
        int[] array = obj.createArray(); //Manual Insertion

        System.out.print("\nInitial Elements Are    : ");
        obj.printArray(array, 0);

        selectionSort(array, array.length, 0);

        System.out.print("After Selection Sorting : ");
        obj.printArray(array, 0);
    }

    //Outer
    public static void selectionSort(int[] array, int length, int index) {
        if (index == length) return;
//        obj.printArray(array, 0); //For Debugging
        int j = minIndex(array, index, length - 1);
        if (j != index) {
            int temp = array[j];
            array[j] = array[index];
            array[index] = temp;
        }
        selectionSort(array, length, index + 1);
    }

    //Inner
    public static int minIndex(int[] array, int start, int end) {
        if (start == end) return start;
        int min = minIndex(array, start + 1, end);
        return array[min] > array[start] ? start : min;
    }
}