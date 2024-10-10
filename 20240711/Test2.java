@FunctionalInterface
public interface BinaryOp{
    int apply(int right, int left);
}
class Test{
    public static void main(String[] args) {
        BinaryOp binder = new BinaryOp() {
            public int apply(int right, int left){
                return right + left;
            }
        };x

        
        System.out.println(binder);
    }


}




