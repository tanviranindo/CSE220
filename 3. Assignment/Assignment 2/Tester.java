import java.util.Scanner;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Tester {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-----KEY INDEX SEARCH AND SORT-----\n");
//        int[] array = {-9, -5, -7, 100, -5, -2, -1, -5};
        int[] array = createArray();

        System.out.print("Initial elements : ");
        for (int i = 0; i < array.length; i++)
            System.out.print(i + 1 == array.length ? array[i] + "\n\n" : array[i] + ", ");

        KeyIndex object = new KeyIndex(array);

        System.out.print("Find an element : ");
        int find = input.nextInt();
//        int find = -1;
//        System.out.println(find);

        System.out.println(find + " is available : " + object.search(find) + "\n");

        System.out.print("After key index sorting: ");
        int[] sortedArray = object.sort();
        for (int i = 0; i < sortedArray.length; i++)
            System.out.print(i + 1 == sortedArray.length ? sortedArray[i] + "\n" : sortedArray[i] + ", ");
    }

    public static int[] createArray() {
        System.out.print("Enter Array Size: ");
        int size = input.nextInt();
        int[] array = new int[0];
        try {
            array = new int[size];
        } catch (ArrayIndexOutOfBoundsException ignored) {
            System.out.println("This can't be array size!");
        }
        System.out.print("Insert " + size + " elements: ");
        for (int i = 0; i < size; i++) array[i] = input.nextInt();
        return array;
    }
}
