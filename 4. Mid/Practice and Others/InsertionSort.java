import java.util.Arrays;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 2, 6, 41, 1, 2, 5, 1, 2, 5, 1, 158, 152, 151, 5, 15, 1, 51, 51, 51};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}
