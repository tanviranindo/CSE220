import java.util.Arrays;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class SortingProblem {
    public static void main(String[] args) {
        int[] arr = {7, 4, 10, 10, 10, 10, 6, 6};
//        int[] arr = {16, 6, 10, 9, 14, 16, 2, 1};
//        int[] arr = {9, 9, 9, 14, 6, 13, 1, 7, 7};
//        int[] arr = {12,19,10,11,12,4,11,13,16,2};
//        int[] arr = {15, 14, 19, 6, 6, 15, 14, 7};
//        int[] arr = {14, 14, 17, 4, 5, 3, 5, 15, 3};
//        int[] arr = {14, 17, 4, 5, 3, 5, 15, 3, 11};
//        int[] arr = {3, 15, 2, 5, 20, 5, 13, 10, 10};
//        int[] arr = {20, 6, 16, 15, 14, 3, 1, 8, 15, 6};
//        int[] arr = {17, 20, 6, 16, 15, 14, 3, 1, 8, 15};
//        int[] arr = {14, 14, 3, 1, 8, 6, 17, 14, 13, 12};
//        int[] arr = {19, 10, 11, 12, 4, 11, 13, 16, 2, 7};
//        int[] arr = {17, 10, 6, 1, 14, 10, 16, 8, 16, 6, 17};
//        int[] arr = {10, 6, 1, 14, 10, 16, 8, 16, 6, 17, 15};
//        int[] arr = {19, 2, 2, 17, 15, 14, 7, 13, 13, 12, 4, 9};


        System.out.println(bubble_sort(arr));
//        System.out.println(Arrays.toString(arr));

//        System.out.println(insertSort(arr));
//        System.out.println(Arrays.toString(arr));
    }

    public static int bubble_sort(int[] arr) {
        int temp, count = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    System.out.println(arr[j] + " " + arr[j + 1]);
                    count++;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return count;
    }

    public static int insertSort(int[] arr) {
        int temp, count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
//                    System.out.println(arr[j] + " " + arr[j + 1]);
                    count++;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else break;
            }
        }
        return count;
    }
}
