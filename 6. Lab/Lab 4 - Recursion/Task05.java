import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of m: ");
        BigInteger m = input.nextBigInteger();
        System.out.print("Enter value of n: ");
        BigInteger n = input.nextBigInteger();
        try {
            System.out.print("Answer: ");
            if(!n.equals(BigInteger.ONE)) printPower(m, n); //SKIP
            System.out.println(power(m, n));
        } catch (StackOverflowError e) {
            System.err.println("Stack Overflow Error!!");
        }
    }

    public static BigInteger power(BigInteger m, BigInteger n) {
        return n.equals(BigInteger.ZERO) ? BigInteger.ONE : m.multiply(power(m, n.subtract(BigInteger.ONE)));
    }

    public static void printPower(BigInteger m, BigInteger n) {
        if (!n.equals(BigInteger.ZERO)) {
            System.out.print(m + (n.equals(BigInteger.ONE) ? " = " : "*"));
            printPower(m, n.subtract(BigInteger.ONE));
        }
    }
}