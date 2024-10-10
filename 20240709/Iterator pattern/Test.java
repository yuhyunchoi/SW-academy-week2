public class Test {
    public static void main(String[] args) {
        Department department = new Department(3);
        department.add(new CollegeBoy(1,"Celine", "CE"));
        department.add(new CollegeBoy(2,"James", "CE"));
        department.add(new CollegeBoy(3, "Jason","CE"));

        Enumerator departmentDEunmerator = department.getEnumerator();

        while(departmentDEunmerator.hasNext()){
            System.out.println(departmentDEunmerator.next());
        }


    }    
}
