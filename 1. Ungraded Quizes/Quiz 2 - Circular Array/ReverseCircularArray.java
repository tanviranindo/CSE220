import java.util.Arrays;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class ReverseCircularArray {
    public static void main(String[] args) {
        reversingCircularArray(new int[]{30, 40, 50, 0, 0, 0, 10, 20, 60}, 6, 6);
        reversingCircularArray(new int[]{30, 40, 50, 0, 0, 0, 10, 20}, 5, 6);
        reversingCircularArray(new int[]{1, 2, 3, 0, 0, 7, 8, 9, 10, 11}, 8, 5);
        reversingCircularArray(new int[]{60, 70, 80, 90, 0, 0, 0}, 4, 0);
        reversingCircularArray(new int[]{60, 70, 80, 90, 100, 0, 0, 0}, 5, 0);
        reversingCircularArray(new int[]{0, 0, 0, 60, 70, 80, 90}, 4, 3);
        reversingCircularArray(new int[]{0, 0, 0, 60, 70, 80, 90, 100}, 5, 3);
        reversingCircularArray(new int[]{1, 0, 0, 0, 2, 3, 4, 5}, 5, 4);
        reversingCircularArray(new int[]{10, 20, 30, 40, 50}, 5, 4);
        reversingCircularArray(new int[]{5, 10, 20, 0, 0, 50, 60, 70, 80, 90, 100, 110}, 10, 5);
        reversingCircularArray(new int[]{20, 10, 0, 0, 0, 0, 0, 0, 0, 0, 40, 30}, 4, 10);
    }


    public static void reversingCircularArray(int[] array, int size, int start) {
        System.out.println("Initial Array: " + Arrays.toString(array));
        int temp1 = start;
        for (int i = 0; i < size; i++) temp1 = (temp1 + 1) % array.length;
        int end = (start + size - 1) % array.length;
        int value = size / 2;
        while (value-- > 0) {
            int temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
            if (start == array.length) start %= array.length;
            if (end == -1) end = array.length - 1;
        }
        System.out.println("Final   Array: " + Arrays.toString(array));
    }
}
