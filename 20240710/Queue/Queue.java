public class Queue implements IQueue {

    private int front = 0;
    private int rear = 0;
    private int MAX = 10;
    public Object[] queue = new Object[MAX];
    
    public void enQueue(Object input){
        
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = input;
    }

    public Object deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            throw new ArrayIndexOutOfBoundsException();
        }
        Object deQueueData = queue[front];
        queue[front++] = null;
        
        return deQueueData;
    }
    public boolean isEmpty(){
        if( front == rear && queue[front] == null )
            return true;
        else 
            return false;

    }

    public boolean isFull(){
        if(front == rear && queue[front] != null)
            return true;
        else 
            return false;
    }
    public int size(){
        return front - rear;
    }

    
}
