/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Array {
    public static void main(String[] args) {
        int[] A = {1, 3, 7, 4, 4, 2, 1, 7};
        int b = index_of_the_second_largest(A);
        System.out.println(b);
    }

    public static int index_of_the_second_largest(int[] arr) {
        int[] copied = new int[arr.length];
//        for (int i = 0; i < copied.length; i++) copied[i] = arr[i];
        System.arraycopy(arr, 0, copied, 0, copied.length);
        for (int i = 0; i < copied.length; i++) {
            for (int j = i + 1; j < copied.length; j++) {
                if (copied[i] < copied[j]) {
                    int temp = copied[i];
                    copied[i] = copied[j];
                    copied[j] = temp;
                }
            }
        }
        int value = 0;
        for (int i = 0; i < copied.length - 1; i++) {
            if (copied[i] != copied[i + 1]) {
                value = copied[i + 1];
                break;
            }
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }
}