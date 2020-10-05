import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Task01 {

    //forMaxValue
    public static BigInteger powerN(BigInteger base, BigInteger power) {
        return !power.equals(BigInteger.ZERO) ? base.multiply(powerN(base, power.subtract(BigInteger.ONE))) : BigInteger.ONE;
    }

    //forMinimumValue
    public static double powerN(double base, int power) {
        return power > 0 ? base * powerN(base, power - 1) : power < 0 ? (1 / (base * powerN(base, power + 1))) : 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        BigInteger base = input.nextBigInteger();
        System.out.print("Enter power: ");
        BigInteger power = input.nextBigInteger();
        if (base.longValue() < 0 || power.longValue() < 0) {
            System.out.println("Not Possible");
            return;
        }
        System.out.println("Answer: " + base + "^" + power + " = " + powerN(base, power));
    }
}
