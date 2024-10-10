public class CollegeBoy extends Student{
    protected String departmentName;

    public CollegeBoy(int studentNo, String studentName, String departmentName){
        super(studentNo, studentName);
        this.departmentName = departmentName;
    }

    public String getDepartmentName(){
        return this.departmentName;
    }

    @Override
    public String toString(){
        return this.studentNo + ", " + this.studentName + ", " + this.departmentName;
    }   

}