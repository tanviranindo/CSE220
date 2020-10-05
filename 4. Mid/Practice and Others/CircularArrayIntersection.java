import java.util.Arrays;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class CircularArrayIntersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5, 8};
        int[] b = {1, 3, 4, 6, 8};
        System.out.println(Arrays.toString(intersection(a, 0, b, 0)));
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

    public static int[] intersection(int a[], int startA, int b[], int startB) {
        a = linearize(a, a.length, startA);
        b = linearize(b, b.length, startB);
        int count = 0;
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    count++;
                }
            }
        }
        int[] intersection = new int[count];
        int k = 0;
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    intersection[k] = i;
                    k++;
                }
            }
        }
        return intersection;
    }
}

