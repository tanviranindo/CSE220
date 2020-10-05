import java.util.Scanner;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Task05 {
    public static void aRow(int max, int i) {
        if (i != 0) {
            System.out.print(i - 1 == 0 ? max - i + 1 : max - i + 1 + "\t");
            aRow(max, i - 1);
        }
    }

    public static void aPattern(int n) {
        if (n != 0) {
            aPattern(n - 1);
            aRow(n, n);
            System.out.println();
        }
    }

    static void bSpace(int space) {
        if (space == 0) return;
        System.out.print("\t");
        bSpace(space - 1);
    }

    static void bValue(int value, int i) {
        if (i <= value) {
            System.out.print(i == value ? i : i + "\t");
            bValue(value, i + 1);
        }
    }

    static void bPattern(int n, int num) {
        if (n != 0) {
            bSpace(n - 1);
            bValue(num - n + 1, 1);
            System.out.println();
            bPattern(n - 1, num);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int n = input.nextInt();
        if (n <= 0) System.out.println("Output: Invalid Value!!");
        if (n > 0) {
            System.out.println("Output A: ");
            aPattern(n);
            System.out.println("Output B: ");
            bPattern(n, n);
        }
    }
}
