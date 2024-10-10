public class Graduate extends Student {
    protected String schoolName;
    protected String major;

    public Graduate(int studentNo, String studentName, String schoolName, String major){
        super(studentNo, studentName);
        this.schoolName = schoolName;
        this.major = major;
    }

    public String getSchoolName(){
        return this.schoolName;
    }
    public String getMajor(){
        return this.major;
    }

    @Override
    public String toString(){
        return this.studentNo + ", " + this.studentName + ", " + this.schoolName + "(" + this.major + ")"; 
    }

}
