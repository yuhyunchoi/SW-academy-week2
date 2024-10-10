public class Stack{

    private int[] intArray = new int[10];
    private int index = 0;


    public void push(int input){
        
        if(isEmpty()){
            intArray[index] = input;
            index++;
        }
        else if (isFull()){
            System.out.println("Stack is full");
        }

    }

    public int pop(int input){
        int output = 0;
        if(isEmpty()){
            output = intArray[--index];
            return output;
        }
        else{
            System.out.println("Stack is empty");
            return 1;
        }
    }
    
    public boolean isEmpty(){

        if(index != -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull(){
        if(index == intArray.length){
            return true;
        }
        else{
            return false;
        }

    }



    public static void main(String[] args) {
        
        Stack stack = new Stack();

        for(int i = 0; i < 10; i++){
            stack.push(i);
        }

        for(int i = 0 ; i < 10; i++){
            System.out.print(stack.pop(i) + " ");
        }
    }
}