import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        BigInteger value = input.nextBigInteger();
        try {
            System.out.println("Factorial of " + value + " is " + findFactorial(value));
        } catch (StackOverflowError e) {
            System.err.println("Stack Overflow Error!!");
        }
    }

    public static BigInteger findFactorial(BigInteger n) {
        return n.equals(BigInteger.ZERO) ? BigInteger.ONE : n.multiply(findFactorial(n.subtract(BigInteger.ONE)));
    }
}