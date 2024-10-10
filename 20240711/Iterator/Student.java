import java.util.ArrayList;

public class Student implements Comparable<Student> {
    protected int studentNo;
    protected String studentName;

    public Student(int studentNo, String studentName){
        this.studentNo = studentNo;
        this.studentName = studentName;
    }

    public int getStudentNo(){
        return this.studentNo;
    }
    public String getStudentName(){
        return this.studentName;
    }

    @Override
    public String toString(){
        return this.studentName + ", " +this.studentNo ; 
    }

    @Override
    public int compareTo(Student s){
        return this.getStudentNo() - s.getStudentNo();
    }
   
}