import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task07 {

    public static BigInteger[] memoization = new BigInteger[10000000];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-- FIBONACCI OF nTH NUMBER --");

        System.out.print("\nnth Number: ");
        BigInteger n = input.nextBigInteger();

        //Output
        try {
            System.out.println("Fibonacci of " + n + " is " + findFibonacci(n));
        } catch (StackOverflowError ignored) {
            System.out.println("Stack OverFlow!");
        } catch (ArrayIndexOutOfBoundsException ignored) {
            System.out.println("Array Index Out Of Bound!");
        } catch (OutOfMemoryError ignored) {
            System.out.println("Out Of Memory Error!");
        }
    }

    public static BigInteger findFibonacci(BigInteger n) {
        return n.equals(BigInteger.ZERO) ? BigInteger.ZERO : n.equals(BigInteger.ONE) ? BigInteger.ONE : memoization[n.intValue()] != null ? memoization[n.intValue()] : (memoization[n.intValue()] = findFibonacci(n.subtract(BigInteger.ONE)).add(findFibonacci(n.subtract(BigInteger.valueOf(2)))));
    }
}