/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public interface Queue {

    int size();

    Patient peek() throws Exception;

    boolean isEmpty();

    void enqueue(Patient d) throws Exception;

    Patient dequeue() throws Exception;

}
