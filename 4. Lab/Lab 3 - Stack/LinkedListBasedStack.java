/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class LinkedListBasedStack implements Stack {
    int size = 0;
    Node head;

    public int size() {
        int count = 0;
        for (Node temp = head; temp != null; temp = temp.next) count++;
        return count;
    }

    public Object peek() throws StackUnderflowException {
        if (head == null) throw new StackUnderflowException();
        else return head.element;
    }

    public boolean isEmpty() {
      return head == null;
    }

    public void push(Object e) {
        Node newNode = new Node(e, null);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public Object pop() throws StackUnderflowException {
        if (head == null) throw new StackUnderflowException();
        else {
            Node temp = head;
            head = head.next;
            size--;
            return temp.element;
        }
    }
}