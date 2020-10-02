/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class PalindromeLinearArray {

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 6, 5, 3, 1, 0, 0, 0};
        int size = 9;
        int startIndex = 2;
        int endIndex = 6;
        System.out.println(isPalindrome(array, size, startIndex, endIndex));
        int[] arrayTwo = {3, 4, 5, 6, 7, 6, 5, 3, 1, 0, 0, 0};
        startIndex = 1;
        endIndex = 6;
        System.out.println(isPalindrome(arrayTwo, size, startIndex, endIndex));
    }

    public static boolean isPalindrome(int[] array, int size, int startIndex, int endIndex) {
        boolean isPalindrome = true;
        int checkSize = endIndex - startIndex;
        int[] reversedArray = new int[checkSize];
        for (int i = 0, j = endIndex; i < checkSize; i++, j--) reversedArray[i] = array[j];
        for (int i = 0; i < checkSize; i++) {
            if (reversedArray[i] != array[i + startIndex]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}