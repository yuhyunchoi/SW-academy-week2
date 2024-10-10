public class Box<T> {  
    T i;

    public Box(T i){
        this.i = i;
    }

    public T getSerial(){
        return this.i;
    }

}

class Test{
    public static void main(String[] args) {

        Number n = new Integer(1);
        Object o = new String("a");

        Box<Number> box = new Box<>(1);
        

    }   
}