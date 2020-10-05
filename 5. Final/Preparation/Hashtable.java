import java.util.Arrays;

/**
 * @author Tanvir Rahman
 * @BRACUID 19101268
 */

public class Hashtable {
    public static void main(String[] args) {
//        String[] arr = {"Jan", "Tim", "Mia", "Sam", "Leo", "Ted", "Bea", "Lou", "Ada", "Max", "Zoe"};
        String[] arr = {"ABC", "IKJ", "LKN", "CAB", "PAL", "TOP"};

        String[] linearProbing = linearProbing(arr);
        System.out.println(Arrays.toString(linearProbing));
        printAtIndex(linearProbing, "CAB");

        Node[] head = forwardChaining(arr);
        printNodeArray(head);
        printAtIndexNode(head, "CAB");

    }

    public static void printAtIndex(String[] arr, String name) {
        int sum = 0;
        for (char c : name.toCharArray()) sum += c % 64;
        for (String s : arr) {
            if (s.equals(name)) {
                System.out.println("Index: " + sum % arr.length);
                break;
            }
        }
    }

    public static void printAtIndexNode(Node[] arr, String name) {
        int count = 0, sum = 0;
        for (char c : name.toCharArray()) sum += c % 64;
        int temp = sum % arr.length;
        for (Node i = arr[temp]; i != null; i = i.next) {
            if (i.element.equals(name)) {
                System.out.println("Index: " + temp + " Node At: " + count);
                break;
            } else count++;
        }
    }

    public static String[] linearProbing(String[] arr) {
        String[] array = new String[arr.length];
        boolean[] memo = new boolean[arr.length];
        for (String s : arr) {
            int sum = 0;
            for (char c : s.toCharArray()) sum += c % 64;
            int temp = sum % arr.length;
            if (!memo[temp]) {
                array[temp] = s;
                memo[temp] = true;
            } else {
                int j = temp;
                while (j < arr.length) {
                    if (!memo[j]) {
                        array[j] = s;
                        memo[j] = true;
                        break;
                    }
                    j = (j + 1) % arr.length;
                }
            }
        }
        return array;
    }


    public static void printNodeArray(Node[] arr) {
        for (Node node : arr) for (Node j = node; j != null; j = j.next) System.out.print(j.element + " ");
        System.out.println();
    }

    public static Node[] forwardChaining(String[] arr) {
        Node[] head = new Node[arr.length];
        Node[] tail = new Node[arr.length];
        boolean[] memo = new boolean[arr.length];
        for (String s : arr) {
            int sum = 0;
            for (char c : s.toCharArray()) sum += c % 64;
            int temp = sum % arr.length;
            if (!memo[temp]) {
                head[temp] = tail[temp] = new Node(s, null);
                memo[temp] = true;
            } else {
                tail[temp].next = new Node(s, null);
                tail[temp] = tail[temp].next;
            }
        }
        return head;
    }
}
