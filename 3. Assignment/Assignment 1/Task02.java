/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Finally " + hMB(5));
    }

    public static int hMB(int h) {
        if (h == 0) {
            System.out.println("Stop: " + h);
            return 0;
        } else if (h == 1) {
            System.out.println("Stop: " + h);
            return h;
        } else {
            System.out.println("Continue: " + h);
            return h + hMB(h - 1);
        }
    }
}