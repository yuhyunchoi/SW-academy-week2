import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableLinkedList implements Iterable<Integer> {

    Node head;
    Node tail;

    public IterableLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void remove(int data) {

        if (head == null) {
            return;
        }

        if (head.data == data) {
            head.next = head;
            if (head == null) {
                tail = null;
            }
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null && currentNode.data == data) {
            currentNode = currentNode.next;
        }

        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
            if (currentNode.next == null) tail = currentNode;
        }
    }

    public Iterator<Integer> iterator() {
        return new LinkedListIterator(head);
    }

    public static void main(String[] args) {

        IterableLinkedList list = new IterableLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("LinkedList after adding elements:");
        for (int value : list) {
            System.out.print(value + " ");
        }

        list.remove(2);
        System.out.println("\nLinkedList after removing element 2:");
        for (int value : list) {
            System.out.print(value + " ");
        }
        
    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListIterator implements Iterator<Integer> {

    private Node current;

    public LinkedListIterator(Node head) {
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Integer next() {
        if (current == null) {
            throw new NoSuchElementException();
        }
        Integer data = current.data;
        current = current.next;
        return data;
    }

}