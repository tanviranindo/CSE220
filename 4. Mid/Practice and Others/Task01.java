import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
            System.out.println(i + ": " + Arrays.toString(createArray(i)));
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n * n];
        for (int i = n; i > 0; i--) for (int j = i * n - 1, k = 1; k <= i; j--, k++) arr[j] = k;
        return arr;
    }
}