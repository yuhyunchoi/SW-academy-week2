public class DepartmentEnumerator implements Enumerator {
    Department department;
    int index = 0;

    public DepartmentEnumerator(Department department){
        this.department = department;
    }
    public Student next(){
        return department.collegeBoys[index++];
    }
    public boolean hasNext(){
        return this.index < department.collegeBoys.length;
    }
    
}
