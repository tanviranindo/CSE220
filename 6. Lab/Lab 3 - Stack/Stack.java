/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public interface Stack {

    int size();

    Object peek() throws StackUnderflowException;

    boolean isEmpty();

    void push(Object e) throws StackOverflowException;

    Object pop() throws StackUnderflowException;
}