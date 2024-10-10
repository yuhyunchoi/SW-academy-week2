public class GraduateEnumerator implements Enumerator {

    GraduateSchool graduateSchool;
    private int index = 0;

    public GraduateEnumerator(GraduateSchool graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public Student next(){
        return graduateSchool.graduates[index++];
    }

    public boolean hasNext(){
        return this.index < graduateSchool.graduates.length;
    }
    
}
