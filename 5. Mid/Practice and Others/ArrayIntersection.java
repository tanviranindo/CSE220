import java.util.Arrays;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5, 8};
        int[] b = {1, 3, 4, 6, 8};
        System.out.println(Arrays.toString(intersection(a, b)));
    }

    public static int[] intersection(int a[], int b[]) {
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
