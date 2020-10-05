import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task03 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        if (length <= 0) {
            System.out.println("Length has to be greater than 0.");
            return;
        }
        int[] arr = new int[length];
        System.out.print("Insert the elements: ");
        arr = insert(arr, 0);
        System.out.print("Elements of the array: ");
        print(arr, 0);

        // CUSTOM TEST
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.print("Elements of the array: ");
//        print(array, 0);
    }

    public static int[] insert(int[] array, int index) {
        if (index < array.length) {
            array[index] = input.nextInt();
            return insert(array, index + 1);
        } else return array;
    }

    public static void print(int[] array, int index) {
        if (index < array.length) {
            System.out.print(index + 1 == array.length ? array[index] + "\n" : array[index] + " ");
            print(array, index + 1);
        }
    }
}