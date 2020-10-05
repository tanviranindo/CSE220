/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class KeyIndex {
    int[] k;
    int min = 0;

    KeyIndex(int[] a) {
        //Find Max Value
        int max = a[0];
        for (int i = 1; i < a.length; i++) if (a[i] > max) max = a[i];

        //Find Min Value
        for (int value : a) if (value < min) min = value;

        //Create Auxiliary Array
        k = new int[max + 1 + Math.abs(min)];

        //Key Indexing
        for (int j : a) k[j + Math.abs(min)]++;

        System.out.println("Key indexing has been completed!\n");
    }


    public boolean search(int value) {
        //Handling obsolete value
        try {
            return k[value + Math.abs(min)] != 0;
        } catch (ArrayIndexOutOfBoundsException ignored) {
            return false;
        }
    }

    public int[] sort() {
        int count = 0;

        //Elements counter
        for (int value : k) if (value != 0) for (int i = 0; i < value; i++) count++;

        //Create Array
        int[] array = new int[count];

        //Sort Auxiliary Array
        for (int i = 0, j = 0; i < k.length; i++) if (k[i] != 0) for (int l = 0; l < k[i]; l++, j++) array[j] = i + min;

        return array;
    }
}
