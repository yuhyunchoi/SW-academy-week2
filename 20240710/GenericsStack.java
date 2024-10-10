
public class GenericsStack<T> {
    
    T[] elements;
    private int index = 0;
    
    public GenericsStack(int size){
        this.elements =(T[]) new Object[size];
    }

    public void push(T element){

        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        this.elements[index++] = element;

    }
    public Object pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        
        return elements[--index];
    }

    public boolean isFull(){
        return this.index == elements.length;
    }
    public boolean isEmpty(){
        return this.index == 0;
    }

    public static void main(String[] args) {
        GenericsStack<Object> gStack = new GenericsStack<>(10);

        for(int i = 0 ; i < 10; i++){
            gStack.push(i);
        }

        try {
            while (!gStack.isEmpty()) {
                System.out.print(gStack.pop() + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
