import java.util.Scanner;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class TreeQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Binary Search Tree Maximum Node Counter---");
//        System.out.print("Enter Height: ");
//        int height = input.nextInt();
//        System.out.print("Enter Level: ");
//        int level = input.nextInt();
        int height = 5, level = height - 1;
        maximumNodeCounter(height, level);
    }

    public static void maximumNodeCounter(int height, int level) {
        System.out.println("Maximum Number of Internal Nodes: " + (long) (Math.pow(2, level) - 1));
        System.out.println("Maximum Number of External Nodes: " + (long) (Math.pow(2, level)));
        System.out.println("Maximum Number of Total Nodes   : " + (long) (Math.pow(2, height) - 1));
    }
}
