/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class LinkedListBasedQueue implements Queue{
    int size = 0;
    Node front = null;
    Node rear = null;

    //Counts Patient
    public int size() {
        if (front == null) size = 0;
        else for (Node i = front; i != null; i = i.next) size++;
        return size;
    }

    //Confirms Empty Or Not
    public boolean isEmpty() {
        return size == 0;
    }

    //Returns First Patient
    public Patient peek() throws Exception {
        if (size == 0) throw new Exception("Queue Underflow Exception");
        else return front.patient;
    }

    //Sorts Everytime While Enqueuing
    public void enqueue(Patient data) {
        Node tail = new Node(data, null);
        if (size == 0) {
            front = tail;
            rear = tail;
        } else {
            Node head = new Node();
            Node temp = head;
            head.next = front;

            while (temp.next != null && temp.next.patient.priority <= tail.patient.priority)
                temp = temp.next;

            tail.next = temp.next;
            temp.next = tail;
            front = head.next;
        }
        size++;
    }

    //Removes First Patient Data
    public Patient dequeue() throws Exception {
        if (size == 0) throw new Exception("Queue Underflow Exception");
        else {
            Patient data = front.patient;
            front = front.next;
            size--;
            return data;
        }
    }
}
