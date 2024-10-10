public class Gcd {

    public int gCD(int a, int b){

        if(b == 0 ){
            return a;
        }
        else{
            return gCD(b, a % b);
        }
    }
    public static void main(String[] args) {
        Gcd gCD = new Gcd();

        System.out.println(gCD.gCD(8,12));
    }

}

