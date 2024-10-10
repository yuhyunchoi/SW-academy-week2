import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorLinkedList implements Iterable<Integer> {
    Node head;
    Node tail;

    public IteratorLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            head = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void remove(int data){

        if(head == null){
            return;
        }
        if(head.data == data){
            head.next = head;
            if(head == null){
                tail = null;
            }
            return;
        }

        Node currentNode = head;

        while(currentNode.next != null && currentNode.data == data){
            currentNode = currentNode.next;
        }

        if(currentNode.next != null){
            currentNode.next = currnetNode.next.next;
            if(currnetNode.next == null){
                tail = currnetNode;
            }
        }
    
    }
    public Iterator<Integer> iterator(){
        return new LinkedListIterator(head);
    }
    public static void main(String[] args){

        IteratorLinkedList list = new IteratorLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("LinkedList after adding elements : ");
        for(int value : list){
            System.out.print(value + " ");
        }

        list.remove(2);
        System.out.println("\nLinkedList after removing elements 2 : ");
        for(int value : list){
            System.out.print(value + " ");
        }


    }

}
class Node{

    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

}

class LinkedListIterator1 implements Iterator<Integer>{

    private Node current;

    public LinkedListIterator1(Node head){
        this.current = head;
    }
    @Override
    public boolean hasNext(){
        return current != null;
    }
    @Override
    public Integer next(){
        if(current == null){
            throw new NoSuchElementException();
        }
        Integer data = current.data;
        current = current.next;
        return data;
    }


}
