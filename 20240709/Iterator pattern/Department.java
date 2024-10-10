public class Department implements Enumerable {
    private int departmentNo;
    private String departmentName;
    private int index = 0;

    CollegeBoy[] collegeBoy;

    public Department(int size){
        this.collegeBoy = new CollegeBoy[size];
    }

    public void add(CollegeBoy boy){
        this.collegeBoy[index++] = boy;
    }
    public int getDepartmentNo(){
        return this.departmentNo;
    }
    public String getDepartmentName(){
        return this.departmentName;
    }
    public int getIndex(){
        return this.index;
    }
    @Override
    public DepartmentEnumerator getEnumerator(){
        return new DepartmentEnumerator(this);
    }


}
