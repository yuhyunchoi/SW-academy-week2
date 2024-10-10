public class Test {
    public static void main(String[] args) {
        BeanFactory factory = new BeanFactory();

        // Create Singleton Student instance
        Student student1 = (Student) factory.createBean(Student.class);
        Student student2 = (Student) factory.createBean(Student.class);

        System.out.println("Student instances are the same: " + (student1 == student2)); // Should print true

        // Create ProtoType Professor instances
        Professor professor1 = (Professor) factory.createBean(Professor.class);
        Professor professor2 = (Professor) factory.createBean(Professor.class);

        System.out.println("Professor instances are the same: " + (professor1 == professor2)); // Should print false
    }
}
