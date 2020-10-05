import java.util.Scanner;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class FibonacciComputation {

    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter m: ");
        int m = input.nextInt();
        findFibonacci(n, m);
        System.out.printf("To compute Fib(%d), Fib(%d) needs to get computed: %d\n", n, m, count);
    }

    public static int findFibonacci(int n, int m) {
        if (n == m) count++;
        return n == 0 ? 0 : n == 1 ? 1 : findFibonacci(n - 1, m) + findFibonacci(n - 2, m);
    }
}
