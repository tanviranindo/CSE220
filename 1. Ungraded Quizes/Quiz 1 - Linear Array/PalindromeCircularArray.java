import java.util.Arrays;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class PalindromeCircularArray {
    public static void main(String[] args) {
        System.out.println("isPalindrome: " + isPalindrome(new int[]{3, 4, 5, 6, 7, 6, 5, 3, 1, 0, 0, 0}, 9, 2, 6));
        System.out.println();
        System.out.println("isPalindrome: " + isPalindrome(new int[]{3, 4, 5, 6, 7, 6, 5, 3, 1, 0, 0, 0}, 9, 1, 6));
        System.out.println();
        System.out.println("isPalindrome: " + isPalindrome(new int[]{3, 4, 5, 0, 0, 0, 6, 5, 4, 3}, 7, 2, 7));
        System.out.println();
        System.out.println("isPalindrome: " + isPalindrome(new int[]{0, 0, 5, 6, 5, 6, 5}, 5, 2, 6));
        System.out.println();
        System.out.println("isPalindrome: " + isPalindrome(new int[]{4, 3, 2, 1, 1, 2, 3, 4}, 8, 0, 7));
        System.out.println();
        System.out.println("isPalindrome: " + isPalindrome(new int[]{4, 3, 2, 1, 1, 2, 3, 4}, 8, 7, 0));
    }


    public static boolean isPalindrome(int[] array, int size, int start, int end) {
        System.out.println("Initial Array: " + Arrays.toString(array));
        System.out.print("From index " + start + " to index " + end + ": ");
        boolean condition = true;
        if (array[(start + 1) % array.length] == 0) condition = false;
        size = start > end ? (size - start + end + 1) : (end - start + 1);
        int[] mainArray = new int[size];
        int anotherOne = start;
        for (int i = 0; i < size; i++) {
            int value = condition ? array[anotherOne++] : array[anotherOne--];
            if (value == 0) {
                start = end;
                break;
            }
            if (anotherOne == array.length) anotherOne = anotherOne % array.length;
            if (anotherOne == -1) anotherOne = array.length - 1;
        }
        for (int i = 0; i < size; i++) {
            mainArray[i] = condition ? array[start++] : array[start--];
            if (start == array.length) start = start % array.length;
            if (start == -1) start = array.length - 1;
            if (mainArray[i] == 0) return false;
        }
        System.out.println(Arrays.toString(mainArray));
        for (int i = 0, j = mainArray.length - 1; i < size / 2; i++, j--)
            if (mainArray[i] != mainArray[j]) return false;
        return true;
    }
}
