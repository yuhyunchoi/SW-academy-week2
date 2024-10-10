public class GraduateEnumerator implements Enumerator {
    GraduateSchool graduateSchool;
    int index = 0;

    public GraduateEnumerator(GraduateSchool graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public boolean hasNext() {
        return this.index < graduateSchool.graduates.length;
    }

    public Student next() {
        return graduateSchool.graduates[index++];
    }
}