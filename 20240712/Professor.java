@CreationType(type = "ProtoType")
public class Professor implements ProtoType {
    private int id;
    private String name;

    public Professor() {
        // 기본 생성자 필요
    }

    public Professor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Professor clone() {
        return new Professor(this.id, this.name);
    }
}
