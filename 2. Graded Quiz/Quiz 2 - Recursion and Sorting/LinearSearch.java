import java.util.Scanner;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class LinearSearch {
    public static void main(String[] args) {
//        int[] arr = {14, 22, 23, 3, 1, 31, 10, 9, 36, 17, 31, 18, 24, 6, 23, 32};
//        int[] arr = {25, 6, 1, 14, 11, 30, 26, 23, 21, 25, 6, 17, 7, 34, 3, 31, 3};
        int[] arr = {17, 11, 21, 17, 32, 13, 20, 24, 37, 21, 12, 31, 25, 11, 37, 40, 33, 37, 13, 30};

        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Value: ");
        int value = input.nextInt();
        for (int i = arr.length - 1; i >= 0; i--) if (arr[i] == value) count++;
        System.out.print("Time: ");
        int time = input.nextInt();
        System.out.println("For value: " + value + ", Total Time: " + (arr.length - count) * time + " ms");
    }
}