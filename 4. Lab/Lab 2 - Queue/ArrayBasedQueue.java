/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class ArrayBasedQueue implements Queue {
    int size = 0;
    int start = 0;
    Patient[] data = new Patient[500];

    public int size() {
        return size;
    }

    public Patient peek() throws Exception {
        if (size == 0) throw new Exception("Queue Underflow Exception.");
        else return data[start % data.length];
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void enqueue(Patient d) throws Exception {
        if (size >= data.length) throw new Exception("Queue OverFlow Exception.");
        else if (size == 0) {
            data[start % data.length] = d;
            size++;
        } else {
            int i = (start + size - 1) % data.length;
            while (i >= start % data.length && data[i].priority > d.priority) {
                data[i + 1] = data[i];
                i = (i - 1) % data.length;
            }
            data[i + 1] = d;
            size++;
        }
    }


    public Patient dequeue() throws Exception {
        if (size == 0) throw new Exception("Queue Underflow Exception.");
        else {
            Patient patient = data[start % data.length];
            data[start % data.length] = null;
            start = (start + 1) % data.length;
            size--;
            return patient;
        }
    }

    public Patient[] toArray() {
        Patient[] array = new Patient[size];
        for (int i = 0, j = start % data.length; i < array.length; i++, j = (j + 1) % data.length)
            array[i] = data[j];
        return array;
    }
}