/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class RunTheCode {
    public static void main(String[] args) {

        System.out.println(X(1813, 6615));
//        System.out.println(X(2380, 5443));
//        System.out.println(X(9653, 117));
//        System.out.println(X(521983910,806690778));
//        System.out.println(X(226705860, 962295036));

//        System.out.println(F(452379554));
//        System.out.println(F(844421852));
//        System.out.println(F(226705860));

//        int arr[] = {7, 8, 9, 7, 9, 1, 5, 9, 6, 6, 9, 5, 1, 9, 7, 9, 8, 7};
//        int arr[] = {4, 3, 2, 3, 3, 3, 2, 3, 4};
//        System.out.println(D(arr, 0, 8));
    }

    public static int X(int a, int b) {
//        if (b == 0) return a;
        if (b == 0) return 0;
        return a + X(a, b - 1);
//        return X(b, a % b);
    }

    public static int F(int n) {
        if (n < 10) return n;
        int m = 0;
        while (n > 0) {
            m += n % 10;
            n = n / 10;
        }
        return F(m);
    }

    public static int D(int[] arr, int left, int right) {
        if (left > right) return 0;
        if (arr[left] != arr[right]) return 0;
        else return 1 + D(arr, left + 1, right - 1);
    }
}
