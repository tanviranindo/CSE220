import java.util.Scanner;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        while (input.hasNextInt()) {
            System.out.println("Output: " + hocBuilder(input.nextInt()));
            System.out.print("Input: ");
        }
    }

    public static int hocBuilder(int height) {
        if (height == 0) return 0;
        else if (height == 1) return 8;
        else return 5 + hocBuilder(height - 1);
    }
}
