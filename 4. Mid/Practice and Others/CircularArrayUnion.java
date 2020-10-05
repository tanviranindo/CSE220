import java.util.Arrays;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class CircularArrayUnion {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5, 8};
        int[] b = {1, 3, 4, 6, 8};
        System.out.println(Arrays.toString(union(a, 0, b, 0)));
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

    public static int[] removeDuplicates(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    int leftShift = j;
                    for (int k = j + 1; k < length; k++, leftShift++) {
                        arr[leftShift] = arr[k];
                    }
                    length--;
                    j--;
                }
            }
        }

        int[] finalArray = new int[length];
        for (int i = 0; i < length; i++) {
            finalArray[i] = arr[i];
        }
        return finalArray;
    }

    public static int[] union(int a[], int startA, int b[], int startB) {
        a = linearize(a, a.length, startA);
        b = linearize(b, b.length, startB);
        int[] union = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) union[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
        while (i < a.length) union[k++] = a[i++];
        while (j < b.length) union[k++] = b[j++];
        union = removeDuplicates(union);
        return union;
    }
}
