/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class BinarySearch {

    public static int count = 0;

    public static void main(String[] args) {
//        int arr[] = {0, 1, 3, 3, 3, 4, 6, 7, 8, 8, 9, 11};
//        int arr[] = {0, 1, 1, 3, 4, 5, 6, 7, 7, 7, 8, 9};
//        int arr[] = {0, 0, 2, 4, 4, 5, 6, 7, 7};
//        int arr[] = {0, 1, 2, 3, 3, 4, 4, 4, 6, 7, 8};
//        int arr[] = {0, 0, 0, 1, 4, 5, 6, 6, 7, 8, 10, 10};
//        int arr[] = {2, 2, 2, 5, 5, 5, 5, 7};
//        int arr[] = {0, 0, 2, 4, 4, 5, 6, 7, 7};
//        int arr[] = {0, 2, 2, 3, 4, 6, 7, 8, 10, 10, 11, 12, 12};
//        int arr[] = {0, 0, 3, 6, 9, 9, 9, 9, 10, 11, 13, 14, 17, 18, 20, 23, 23, 26, 27, 29, 30, 32, 35, 35, 35, 36, 37, 38, 40, 40};
//        int arr[] = {2, 3, 4, 5, 7, 7, 9, 9, 10, 10, 11, 12, 12, 14, 14, 15, 15, 19, 19, 20, 21, 27, 27, 28, 29, 30, 37};
//        int[] arr = {6, 6, 7, 7, 8, 8, 10, 10, 14, 15, 15, 15, 18, 21, 21, 21, 22, 23, 25, 27, 30};
//        int[] arr = {1, 1, 3, 4, 4, 5, 5, 6, 11, 12, 12, 14, 14, 15, 16, 16};
        int[] arr = {1, 2, 2, 4, 5, 7, 8, 8, 8, 8, 9, 10};
        binarySearch(arr, 0, arr.length - 1, 10);
    }

    public static int binarySearch(int[] arr, int left, int right, int val) {
        if (left > right) return -1;
        int M = (left + right) / 2;
        count++;
        System.out.println("Middle Index: " + M + " Value: " + arr[M] + " Count: " + count);
        //count*time
        if (arr[M] == val) return M;
        if (arr[M] > val) {
            return binarySearch(arr, left, M - 1, val);
        } else return binarySearch(arr, M + 1, right, val);
    }
}
