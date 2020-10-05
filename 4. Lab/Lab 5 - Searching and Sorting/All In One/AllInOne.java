/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class AllInOne {
    public static void main(String[] args) {
        //ARRAY
        int[] arr = {5, 4, 3, 2, 1};

        //Task 01
//        selectionSortArray(arr, arr.length, 0);

        //Task 02
//        insertionSortArray(arr, arr.length - 1);

//        System.out.println(Arrays.toString(arr));


        //LINKED LIST
        Node head = new Node(arr[0], null, null);
        Node tail = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, null);
            tail.next = temp;
            temp.previous = tail;
            tail = tail.next;
        }

        //Task 03
//        bubbleSortSLL(head);

        //Task 04
//        selectionSortSLL(head);

        //Task 05
//        insertionSortDLL(head);

        System.out.print("List: ");
        for (Node i = head; i != null; i = i.next) System.out.print(i.data + " ");
        System.out.println();

        //Task 06
        int[] sort = {1, 1, 2, 3, 4, 5, 5, 6, 6, 7};
        System.out.println("Value is available at index: " + binarySearch(sort, 0, arr.length - 1, 4));

        //Task 07
        int n = 6;
        System.out.println("Fibonacci of " + n + " is " + fib(n));

    }


    //Task01
    public static void selectionSortArray(int[] a, int max, int i) {
        if (i == max) return;
        int j = min(a, i, max - 1);
        if (j != i) {
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
        selectionSortArray(a, max, i + 1);
    }

    public static int min(int[] a, int i, int j) {
        if (i == j) return i;
        int v = min(a, i + 1, j);
        if (a[v] > a[i]) return i;
        else return v;
    }

    //Task02
    public static void insertionSortArray(int[] a, int i) {
        if (i == 0) return;
        insertionSortArray(a, i - 1);
        sort(a, a[i], i - 1);
    }

    public static void sort(int[] a, int val, int i) {
        if (i < 0 || a[i] < val) {
            a[i + 1] = val;
            return;
        }
        a[i + 1] = a[i];
        sort(a, val, i - 1);
    }

    //Task 03
    public static void bubbleSortSLL(Node h) {
        for (Node a = h; a != null; a = a.next) {
            for (Node b = h; b.next != null; b = b.next) {
                if (b.data > b.next.data) {
                    int t = b.data;
                    b.data = b.next.data;
                    b.next.data = t;
                }
            }
        }
    }

    //Task 04
    public static void selectionSortSLL(Node h) {
        for (Node a = h; a.next != null; a = a.next) {
            Node i = a;
            for (Node b = a.next; b != null; b = b.next) if (b.data < i.data) i = b;
            int temp = i.data;
            i.data = a.data;
            a.data = temp;
        }
    }

    //Task 05
    public static void insertionSortDLL(Node h) {
        for (Node i = h; i != null; i = i.next) {
            int temp = i.data;
            Node j = i;
            while (j.previous != null && j.previous.data > temp) {
                j.data = j.previous.data;
                j = j.previous;
            }
            j.data = temp;
        }
    }

    //Task 06
    public static int binarySearch(int[] a, int l, int r, int v) {
        if (l > r) return -1;
        int mid = (l + r) / 2;
        if (a[mid] == v) return mid;
        else if (a[mid] > v) return binarySearch(a, l, mid - 1, v);
        else return binarySearch(a, mid + 1, r, v);
    }

    //Task 07
    public static int[] mem = new int[100];

    public static int fib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (mem[ n] != 0) return mem[n];
        else {
            int t = fib(n - 1) + fib(n - 2);
            mem[n] = t;
            return t;
        }
    }
}
