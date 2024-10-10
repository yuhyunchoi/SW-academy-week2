import java.math.*;

public class Rational {

    private int numerator; //분자
    private int denominator; // 분모
    public Rational(int numerator, int denominator){  
    
        if(denominator == 0){
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        int mod = gCD(numerator, denominator);
        this.numerator = numerator/mod;
        this.denominator = denominator/mod;

    }
    
    public static Rational add(Rational r1, Rational r2) {
        int resultNumerator = r1.numerator*r2.denominator + r2.numerator*r1.denominator;
        int resultDenominator = r1.denominator*r2.denominator;

        return new Rational(resultNumerator, resultDenominator);
    }
    
    public static Rational multiply(Rational r1, Rational r2) {
        int resultNumerator = r1.numerator*r2.numerator;
        int resultDenominator = r1.denominator*r2.denominator;

        return new Rational(resultNumerator, resultDenominator);
    }
    
    public static Rational substract(Rational r1, Rational r2) {
        int resultNumerator = r1.numerator*r2.denominator - r2.numerator*r1.denominator;
        int resultDenominator = r1.denominator*r2.denominator;

        return new Rational(resultNumerator, resultDenominator);

    }
    public static Rational divide(Rational r1, Rational r2) {
        int resultNumerator = r1.numerator*r2.denominator;
        int resultDenominator = r1.denominator*r2.numerator;

        return new Rational(resultNumerator, resultDenominator);
    }


    public static int gCD(int a, int b){

        if(b == 0 ){
            return a;
        }
        else{
            return gCD(b, a % b);
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
        Rational r1 = new Rational(1,2); // 1/2
        Rational r2 = new Rational(1,2); // 1/2
        Rational result1 = Rational.add(r1, r2); // 1을 반환
        System.out.println(result1);

        Rational r3 = new Rational(1,2); // 1/2
        Rational r4 = new Rational(1,2); // 1/2
        Rational result2 =  Rational.multiply(r3, r4); // 1/4을 반환
        System.out.println(result2);

        Rational r5 = new Rational(1,12); // 1/2
        Rational r6 = new Rational(1,2); // 1/2
        Rational result3 =  Rational.substract(r5, r6); // 0을 반환
        System.out.println(result3);

        
        Rational r7 = new Rational(1,2); // 1/2
        Rational r8 = new Rational(1,2); // 1/2
        Rational result4 =  Rational.divide(r7, r8); // 1
        System.out.println(result4);
    }
    
}