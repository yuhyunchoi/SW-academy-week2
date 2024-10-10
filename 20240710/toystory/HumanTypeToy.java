public class HumanTypeToy extends Toy{

    public HumanTypeToy(int toyNo, String name){
        super(toyNo, name);
    }

    public int getToyNo(){
        return this.toyNo;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name + ", ";
    }

    @Override
    public void move(){
        System.out.println(this.getName() + "(이)가 두 발로 걸어다닙니다");
    }
}  