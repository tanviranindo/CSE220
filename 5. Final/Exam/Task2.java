/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Task2 {

    public static void main(String[] args) {
        String[] A = {"d", "c", "b", "a", "c"};
        int answer = computeShifts(A);
        System.out.println(answer);
    }

    public static int computeShifts(String[] A) {
        String[] B = new String[A.length];
        String temp;
        int size = 0;
        int count = 0;
        B[0] = A[0];
        size++;
        for (int i = 1; i < A.length; i++) {
            B[i] = A[i];
            size++;
            for (int j = 0; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (B[j].compareTo(B[k]) > 0) {
                        temp = B[i];
                        B[i] = B[j];
                        B[j] = temp;
                        count++;

                    }
                }
            }
        }
        return count;
    }
}