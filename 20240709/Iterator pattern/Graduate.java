public class Graduate extends Student{
    
    protected String schoolNumber;

    public Graduate(int studentNo, String name, String graduateName){
        super(studentNo, name);
        this.schoolNumber = graduateName;
    }
    
    public int getStudentNo(){
        return this.studentNo;
    }
    public String getName(){
        return this.name;
    }
    public String getGraduateName(){
        return this.schoolNumber;
    }

}