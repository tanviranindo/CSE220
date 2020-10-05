import java.util.Arrays;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 0};
//        int[] arr = {1, 0, 3, 1, 3, 1};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr) {
        int max = arr[0];
        for (int i : arr) if (i > max) max = i;
        int[] count = new int[max + 1];
        int[] output = new int[arr.length];
        for (int j : arr) count[j]++;

        for (int i = 1; i < count.length; i++) count[i] += count[i - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
//        System.out.println(Arrays.toString(count));
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}