public class DataBean implements ProtoType {
    private int no;
    private String name;

    public DataBean(int no, String name){
        this.no = no;
        this.name = name;
    }

    public int getNo(){
        return this.no;
    }
    
    public String getName(){
        return this.name;
    }

    public DataBean clone(){
        return new DataBean(this.no, this.name);
    }

    
}
