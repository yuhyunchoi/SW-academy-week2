public abstract class Toy implements Movable{
    int toyNo;
    String name;
    
    public Toy(int toyNo, String name){
        this.toyNo = toyNo;
        this.name = name;
    }

    public int getToyNo(){
        return this.toyNo;
    }
    public String getName(){
        return this.name;
    }


    public void say(Toy toy, String message){
        System.out.println(this.name + "(이)가 " + toy.getName() + "에게 말을 합니다" );
        System.out.println(message);
    }

}