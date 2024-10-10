public class Graduate extends Student{

    private String schoolName;

    public Graduate(int studentNumber, String studentName, String schoolName){
        super(studentNumber, studentName);
        this.schoolName = schoolName;
    }
    public int getStudentNumber(){
        return this.studentNumber;
    } 
    public String getStudentName(){
        return this.studentName;
    }
    public String getSchoolName(){
        return this.schoolName;
    }
    @Override
    public String toString(){
        return this.studentNumber + ", " + this.studentName + ", " + this.schoolName;
    }

} 