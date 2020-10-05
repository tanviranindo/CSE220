/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task02 {

    static Functions obj = new Functions();

    public static void main(String[] args) {
        System.out.println("--- INSERTION SORT IN ARRAY USING RECURSION ---");

//        int[] array = {6, 4, 16, 15, 8, 10, 18, 19, 7, 13, 9, 20, 11, 17, 5, 3, 2, 12, 14, 1}; //Auto Insertion
        int[] array = obj.createArray(); //Manual Insertion

        System.out.print("\nInitial Elements Are    : ");
        obj.printArray(array, 0);

        insertionSort(array, array.length - 1);

        System.out.print("After Insertion Sorting : ");
        obj.printArray(array, 0);
    }

    //Outer
    public static void insertionSort(int[] array, int index) {
        if (index == 0) return;
//        obj.printArray(array, 0); //For Debugging
        insertionSort(array, index - 1);
        inside(array, array[index], index - 1);
    }

    //Inner
    public static void inside(int[] array, int value, int index) {
        if (index < 0 || array[index] < value) {
            array[index + 1] = value;
            return;
        }

        array[index + 1] = array[index];
        inside(array, value, index - 1);
    }
}