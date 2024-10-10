@FunctionalInterface
public interface BinaryOp{
    int apply(int i, int j);
}

class Algorithm {
    public int calc(BinaryOp binder, int init, int start, int end, int step){
        int result = init;
        for(int i = start; i <= end; i += step){
            result = binder.apply(result, i);
        }
        return result;
    }
}
class Test{
    public static void main(String[] args) {
        Algorithm algo = new Algorithm();
        int result1 = algo.calc((x,y) -> x + y, 0, 1, 10, 1);
        int result2 = algo.calc((x,y) -> x * y, 1,1,10,1);

        System.out.println(result1);
        System.out.println(result2);

        BinaryOp binder  = new BinaryOp() { // 
            public int apply(int right, int left){
                return right + left;
            }
        };

        BinaryOp adder = (x,y) -> x + y;
    }

}



/* 
@FunctionalInterface
public interface BinaryOp {
    int apply(int i, int j);
}

class Adder implements BinaryOp{
    public int apply(int i, int j){
        return i + j;
    }
}
class Muliplier implements BinaryOp{
    public int apply(int i, int j){
        return i* j;
    }
}

class Algorithm{
    public int calc(BinaryOp binder, int init, int start, int end, int step){
        int result = init;
        for(int i = start; i <= end ; i += step){
            binder.apply(result, i);
        }
        return result;
    }
}

class Test{
    public static void main(String[] args) {
        Algorithm algo = new Algorithm();
        algo.calc((x,y) -> x + y, 0,1,10,1);
        algo.calc((x,y) -> x * y, 1,1,10,1);
    
    }
}
*/