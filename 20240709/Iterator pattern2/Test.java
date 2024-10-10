public class Test{

    public static void main(String[] args) {
        
        Department department = new Department(3);
        department.add(new CollegeBoy(1,"Celine", 11 , "Computer Science"));
        department.add(new CollegeBoy(2,"Jason", 11, "Computer Science"));
        department.add(new CollegeBoy(3,"James", 11, "Computer Science"));


        Enumerator departmentDEunmerator = department.getEnumerator();

        while(departmentDEunmerator.hasNext()){
            System.out.println(departmentDEunmerator.next());
        }

    }

}