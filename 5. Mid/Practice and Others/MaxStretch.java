/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class MaxStretch {
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1, 3};
        int[] B = {1, 4, 2, 1, 4, 1, 4};
        int[] C = {1, 4, 2, 1, 4, 4, 4};

        System.out.println(maxStretch(A));
        System.out.println(maxStretch(B));
        System.out.println(maxStretch(C));
    }

    public static int maxStretch(int[] arr) {
        int temp = 0;
        int max = temp;
        for (int k : arr) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (k == arr[j]) {
                    temp = j;
                }
                if (max < temp) max = temp;
            }
        }
        return max;
    }
}
