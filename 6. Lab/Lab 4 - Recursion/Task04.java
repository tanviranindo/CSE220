import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value: ");
        int value = input.nextInt();
        System.out.println("Binary value of " + value + " is " + (value == 0 ? 0 : toBinaryString(value)));

        //CUSTOM TEST
//        System.out.print("Binary value of " + value + " is " + (value == 0 ? 0 : ""));
//        toBinaryPrint(value);
//        System.out.println();

    }

    //Concatenate String
    public static String toBinaryString(int n) {
        return n == 0 ? "" : toBinaryString(n / 2) + "" + n % 2;
    }

    //Direct Print
    public static void toBinaryPrint(int n) {
        if (n != 0) {
            toBinaryPrint(n / 2);
            System.out.print(n % 2);
        }
    }
}