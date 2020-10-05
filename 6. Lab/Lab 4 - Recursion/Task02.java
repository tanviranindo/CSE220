import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long value = input.nextLong();
        System.out.println("Fibonacci of " + value + " is " + findFibonacci(value));
    }

    public static long findFibonacci(long n) {
        return n == 0 ? 0 : n == 1 ? 1 : findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}