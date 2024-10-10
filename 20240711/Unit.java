public abstract class Unit{
    protected int no;
    protected String name;
    
    public Unit(int no, String name){
        this.no = no;
        this.name = name;
    }
}

interface Attacker{
    void attack(Unit unit);
}
interface Attackable{
    void byAttacked(Attacker attacker);
}

class Marine extends Unit implements Attacker{

    public Marine(int no, String name){
        super(no, name);
    }

    public void byAttacked(Attacker attacker){
        attacker.attack(this);
    }

    public void attack(Unit unit){
        System.out.println("기관총 어택");
    }
    
}
class Zealot extends Unit{
    public Zealot(int no, String name){
        super(no, name);
    }
}

class Test{

    public static void main(String[] args) {
        Marine m1 = new Marine(1,"Marine1");
        Marine m2 = new Marine(2,"Marine2");

        m1.byAttacked((u) -> System.out.println("..."));


    }


}