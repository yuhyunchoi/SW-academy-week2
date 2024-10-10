public class Department implements Enumerable{

    private int departmentNumber;
    private String departmentName;
    private int index = 0;

    CollegeBoy[] collegeBoys;

    public Department(int size){
        this.collegeBoys = new CollegeBoy[size]; 
    }
    
    public void add(CollegeBoy boy){
        this.collegeBoys[index++] = boy;
    }

    public int getDepartmentNumber(){
        return this.departmentNumber;
    }
    public String getDepartmentName(){
        return this.departmentName;
    }
    @Override
    public DepartmentEnumerator getEnumerator(){
        return new DepartmentEnumerator(this);
    }
}
