public class DepartmentEnumerator implements Enumerator {
    Department department;
    int index = 0;

    public DepartmentEnumerator(Department department){
        this.department = department;
    }
    public boolean hasNext(){
        return this.index < department.collegeBoy.length;  //?
    }

    public Student next(){
        return department.collegeBoy[index++];
    }
}
