import java.util.EmptyStackException;
import java.util.NoSuchElementException;
/*
    David Mwas SIT/B/01-02286/2021
    JOSEPH OMONDI SIT/B/01-02668/2021
    CYNTHIA DAASHA SIT/
    SAMUEL 
 */
// QUESTION 1
public class Mmustlinkedin {
    private Node head; 

    
    private class Node {
        int data; 
        Node next; 

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    QUESTION 2
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

    

// QUESTION 3

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
    // Time complexity of stack operations: O(1)

    // IMPLEMENTATION OF THE Mmustlinkein class
    
    public static void main(String[] args) {
        Mmustlinkedin m = new Mmustlinkedin();
        m.push(12);
        System.out.println(m.pop());
        m.enqueue(13);
        System.out.println(m.dequeue());
    }
}