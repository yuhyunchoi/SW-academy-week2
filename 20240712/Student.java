@CreationType(type = "Singleton")
public class Student implements ProtoType {
    private static Student instance;

    private Student() {
        // private 생성자로 외부에서 인스턴스화 방지
    }

    public static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }

    @Override
    public Student clone() {
        return getInstance(); // Always returns the single instance
    }
}
