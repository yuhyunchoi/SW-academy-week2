import java.math.*;

public class Rational2 {
    private int numerator; //분자
    private int denominator; // 분모

    public Rational2 (int numerator, int denominator){

        
        if(denominator == 0){
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        else{
            int mod = Gcd(numerator, denominator);
            this.numerator = numerator/mod;
            this.denominator = denominator/mod;
        }

    }

    public static Rational2 add(Rational2 r1, Rational2 r2){
        int resultNumerator = r1.numerator*r2.denominator + r1.denominator*r2.numerator;
        int resultDenominator = r1.denominator*r2.denominator;

        return new Rational2(resultNumerator, resultDenominator);
    }
    public static Rational2 substract(Rational2 r1, Rational2 r2){
        int resultNumerator = r1.numerator*r2.denominator - r1.denominator*r2.numerator;
        int resultDenominator = r1.denominator*r2.denominator;

        return new Rational2(resultNumerator, resultDenominator);
    }
    public static Rational2 multiply(Rational2 r1, Rational2 r2){
        int resultNumerator = r1.numerator*r2.numerator;
        int resultDenominator = r1.denominator*r2.denominator;
        
        return new Rational2(resultNumerator, resultDenominator);
    }
    public static Rational2 divide(Rational2 r1, Rational2 r2){
        int resultNumerator = r1.numerator*r2.denominator;
        int resultDenominator = r1.denominator*r2.numerator;

        return new Rational2(resultNumerator, resultDenominator);
    }


    public static int Gcd(int a, int b){

        if(b == 0){
            return a;
        }
        else{
            return Gcd(b, a % b);
        }

    }

    @Override
    public String toString(){

        if(numerator % denominator == 0){

            return String.valueOf(numerator/denominator);
        }
        else if(numerator < 0 || denominator < 0){
            return "-" + Math.abs(numerator) + "/" + Math.abs(denominator);
        }
        else{
            return numerator + "/" + denominator;
        }
    }

}
    
class Test{
    public static void main(String[] args) {
        Rational2 r1 = new Rational2(1,2); // 1/2
        Rational2 r2 = new Rational2(1,2); // 1/2
        Rational2 result1 = Rational2.add(r1, r2); // 1을 반환
        System.out.println(result1);

        Rational2 r3 = new Rational2(1,2); // 1/2
        Rational2 r4 = new Rational2(1,2); // 1/2
        Rational2 result2 =  Rational2.multiply(r3, r4); // 1/4을 반환
        System.out.println(result2);

        Rational2 r5 = new Rational2(1,12); // 1/2
        Rational2 r6 = new Rational2(1,2); // 1/2
        Rational2 result3 =  Rational2.substract(r5, r6); // 0을 반환
        System.out.println(result3);

        
        Rational2 r7 = new Rational2(1,2); // 1/2
        Rational2 r8 = new Rational2(1,2); // 1/2
        Rational2 result4 =  Rational2.divide(r7, r8); // 1
        System.out.println(result4);
    }
}

