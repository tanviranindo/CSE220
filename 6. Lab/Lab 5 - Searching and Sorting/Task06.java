import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task06 {

    static Scanner input = new Scanner(System.in);
    static Functions obj = new Functions();

    public static void main(String[] args) {
        System.out.println("--- BINARY SEARCH USING RECURSION ---");

//        int[] array = {1, 2, 7, 7, 7, 7, 8, 12, 12, 13, 14, 15, 16, 17};
        int[] array = obj.createArray();

        System.out.print("\nInitial Elements Are : ");
        obj.printArray(array, 0);

        System.out.print("Search For A Number  : ");
        int value = input.nextInt();

        int index = binarySearch(array, 0, array.length - 1, value);
        System.out.println(index == -1 ? value + " is not available!" : value + " is available at index " + index);
    }

    //Binary Search
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        return array[mid] == value ? mid : array[mid] > value ? binarySearch(array, left, mid - 1, value) : binarySearch(array, mid + 1, right, value);
    }
}
