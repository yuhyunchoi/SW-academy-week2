public class CollegeBoy extends Student{

    protected String departmentName;

    public CollegeBoy(int studentNo, String name, String departmentName){
        super(studentNo, name);
        this.departmentName = departmentName;
    }

    public int getStudentNo(){
        return this.studentNo;
    }
    public String getName(){
        return this.name;
    }
    public String getDepartmentNo(){
        return this.getDepartmentNo();
    }
    public String getDepartmentName(){
        return this.getDepartmentName();
    }
    @Override
    public String toString(){
        return this.studentNo + ", " + this.name + ", " + this.departmentName;
    }

    

}