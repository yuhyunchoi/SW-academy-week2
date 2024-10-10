public class Queue{

    public int MAX = 10;
    public int front;
    public int rear;
    public int[] Queue;
    public Queue() {
        front = rear = 0;
        Queue = new int[MAX];
    }
    public boolean isEmpty(){  
        if(front == rear){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull(){
        if(rear == MAX - 1 ){
            return true;
        }
        else{
            return false;
        }
    }

    public int size(){
        return front - rear;
    }

    public void add(int input){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        Queue[rear++] = input;
    
    }

    public int poll(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        
        int output = Queue[front++];
        return output;
    
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            int output = Queue[front];
            return output;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        for(int i : queue.Queue){
            queue.add(i);
        }
        for(int i : queue.Queue){
           System.out.print(queue.poll()+ " ");
        }
        
    }




}