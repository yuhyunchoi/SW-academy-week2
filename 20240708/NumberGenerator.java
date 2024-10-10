public class NumberGenerator {
    private int number = 0;
    private static NumberGenerator numberGenerator = null;


    public static NumberGenerator getNumberGenerator() {
        if(numberGenerator == null)
            numberGenerator = new NumberGenerator();
        return numberGenerator;
     }

    private NumberGenerator() {}
    public int nextNumber(){
        return ++number;
    }

     
}
class Test{
    public static void main(String[] args) {
        NumberGenerator gen = NumberGenerator.getNumberGenerator();
        System.out.println(gen.nextNumber());
        System.out.println(gen.nextNumber());

        NumberGenerator gen2 = NumberGenerator.getNumberGenerator();
        System.out.println(gen2.nextNumber());
        System.out.println(gen2.nextNumber());
    
    }
}
