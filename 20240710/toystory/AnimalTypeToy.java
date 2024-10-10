public class AnimalTypeToy extends Toy {

    private String shape;
    
    AnimalTypeToy(int toyNo, String name, String shape){
        super(toyNo, name);
        this.shape = shape;
    }

    public int getToyNo(){
        return this.toyNo;
    }
    public String getName(){
        return this.name;
    }
    public String getShape(){
        return this.shape;
    }

    @Override
    public void move(){
        System.out.println(this.getName() + "(이)가 뜁니다");
    }

    
}
