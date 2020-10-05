/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Node {
    Patient patient;
    Node next;

    public Node(Patient d, Node n) {
        patient = d;
        next = n;
    }

    public Node() {
        //For The Empty Constructor
    }
}
