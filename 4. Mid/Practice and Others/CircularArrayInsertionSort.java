import java.util.Arrays;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class CircularArrayInsertionSort {
    public static void main(String[] args) {
        int[] array = {415, 2, 0, 0, 6, 41};
        System.out.println(Arrays.toString(insertionSort(array, 4, 4)));
    }

    public static int[] linearize(int[] array, int size, int start) {
        int[] linear = new int[size];
        int j = start;
        for (int i = 0; i < size; i++) {
            linear[i] = array[j];
            j = (j + 1) % array.length;
        }
        return linear;
    }

    public static int[] circularArray(int[] array, int size, int length, int start) {
        int[] circularArr = new int[length];
        int j = start;
        for (int i = 0; i < size; i++) {
            circularArr[j] = array[i];
            j = (j + 1) % circularArr.length;
        }
        return circularArr;
    }

    public static int[] insertionSort(int[] array, int size, int start) {
        int length = array.length;
        array = linearize(array, size, start);
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        array = circularArray(array, size, length, start);
        return array;
    }
}