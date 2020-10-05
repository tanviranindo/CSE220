/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, -1};
        int[] arr1 = {100, 0, 100};
        int[] arr2 = {100, 90, 100};
        int[] arr3 = {3, 2, 1};
        int[] arr4 = {1, 2, 3};
        int[] arr5 = {0, 0, 0, 0};
        int[] arr6 = {-1, -5, 0, -9, -9, 8};
        int[] arr7 = {2, 2, 2, 2, 2};
        int[] arr8 = {-1, -1, -1, -1, -1, -1};

        System.out.println(sum(arr, 0, 0));
        System.out.println(sum(arr1, 0, 0));
        System.out.println(sum(arr2, 0, 0));
        System.out.println(sum(arr3, 0, 0));
        System.out.println(sum(arr4, 0, 0));
        System.out.println(sum(arr5, 0, 0));
        System.out.println(sum(arr6, 0, 0));
        System.out.println(sum(arr7, 0, 0));
        System.out.println(sum(arr8, 0, 0));
    }


    public static int sum(int[] arr, int right, int sum) {
        return right == arr.length ? sum : sum(arr, right + 1, sum + max(arr, 0, right, arr[0]));
    }

    public static int max(int[] arr, int left, int right, int max) {
        if (left != right + 1) {
            int temp = max(arr, left + 1, right, arr[0] > arr[left] ? arr[0] : arr[left]);
            return (arr[left] > temp ? arr[left] : temp);
        } else return max;
    }
}
