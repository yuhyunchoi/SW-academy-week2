public class CollegeBoy extends Student {
    private int departmentNumber;
    private String departmentName;

    public CollegeBoy(int studentNumber, String studentName, int departmentNumber, String departmentName) {
        super(studentNumber, studentName);
        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
    }

    public int getStudentNumber(){
        return  this.studentNumber;
    }
    public String getStundentName(){
        return this.studentName;
    }
    public int getDepartmentNumber(){
        return this.departmentNumber;
    }
    public String getDepartmentName(){
        return this.departmentName;
    }
    @Override
    public String toString(){
        return this.studentNumber + ", " + this.studentName + ", " + this.departmentNumber + ", " + this.departmentName;
    }

    
    
}
