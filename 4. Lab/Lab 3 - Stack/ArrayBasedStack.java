/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class ArrayBasedStack implements Stack {
    int size = 0;
    Object[] data = new Object[500];


    public int size() {
        return size;
    }

    public Object peek() throws StackUnderflowException {
        if (size == 0) throw new StackUnderflowException();
        else return data[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(Object e) throws StackOverflowException {
        if (data.length == size) throw new StackOverflowException();
        else {
            data[size] = e;
            size++;
        }
    }

    public Object pop() throws StackUnderflowException {
        if (size == 0) throw new StackUnderflowException();
        else {
            Object temp = data[size - 1];
            data[size - 1] = null;
            size--;
            return temp;
        }
    }
}