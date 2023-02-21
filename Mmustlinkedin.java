import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Mmustlinkedin {
    private Node head; // reference to the head of the linked list

    // Inner class for linked list node
    private class Node {
        int data; // data stored in the node
        Node next; // reference to the next node in the list

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack implementation using linked list
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    // Time complexity of stack operations: O(1)

    // Queue implementation using linked list
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public int dequeue() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        int data = head.data;
        head = head.next;
        return data;
    }

    // Time complexity of queue operations: O(1) for enqueue, O(n) for dequeue (n is the size of the queue)
    public static void main(String[] args) {
        Mmustlinkedin m = new Mmustlinkedin();
        m.push(12);
        System.out.println(m.pop());
        m.enqueue(13);
        System.out.println(m.dequeue());
    }
}