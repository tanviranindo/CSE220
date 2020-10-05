import java.util.Arrays;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Task3 {
    public static int min = 0;

    public static int[] aux(int[] a) {
        for (int value : a) if (value < min) min = value;
        int max = a[0];
        for (int i = 1; i < a.length; i++) if (a[i] > max) max = a[i];
        for (int value : a) if (value < min) min = value;
        int[] k = new int[max + 1 + (-1) * (min)];
        for (int j : a) k[j + (-1) * (min)]++;
        return k;
    }

    public static boolean count(int x, int[] AUX) {
        try {
            return AUX[x + (-1) * (min)] != 0;
        } catch (ArrayIndexOutOfBoundsException ignored) {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] raw = {6, 8, -7, 6, 5, -7, 7, 3, -3, 7};
        int[] aux = aux(raw);
        System.out.println("Original  Array: " + Arrays.toString(raw));
        System.out.println("Auxiliary Array: " + Arrays.toString(aux));
        int value1 = -3;
        int value2 = 0;
        System.out.println(value1 + " is " + (count(value1, aux) ? "available " : "not available ") + "in the array.");
        System.out.println(value2 + " is " + (count(value2, aux) ? "available " : "not available ") + "in the array.");
    }
}
