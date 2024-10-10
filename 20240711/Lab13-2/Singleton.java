
public class Singleton {
    private int accuontNo = 0;
    private int cardNo = 0;

    private static Singleton singleton;
    
    private Singleton(){

    }

    public int getNextAccountNo(){
        return accuontNo++;
    }
    public int getNextCardNo(){
        return cardNo++;
    }

    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
class Test{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();

        System.out.println(s1.getNextAccountNo());
        System.out.println(s1.getNextAccountNo());
        System.out.println(s2.getNextAccountNo());
        System.out.println(s2.getNextAccountNo());
        
        System.out.println(s1.getNextCardNo());
        System.out.println(s1.getNextCardNo());
        System.out.println(s2.getNextCardNo());
        System.out.println(s2.getNextCardNo());
       
    }
}



//인스턴스 하나로 보장
//싱글턴 하나가 두 개의 
//싱글턴 객체가 한 번에 두 가지?

// 프로토 타입 패턴??
// 프로토 타입, 싱글턴 이해하면 좋다~
