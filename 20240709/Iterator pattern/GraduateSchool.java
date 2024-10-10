public class GraduateSchool implements Enumerable {
    private String graduateSchoolName;
    private int index = 0;

    Graduate[] graduates;

    public GraduateSchool(String graduateSchoolName, int size) {
        this.graduateSchoolName = graduateSchoolName;
        this.graduates = new Graduate[size];
    }

    public void add(Graduate graduate) {
        this.graduates[index++] = graduate;
    }

    public String getGraduateSchoolName() {
        return this.graduateSchoolName;
    }

    @Override
    public GraduateEnumerator getEnumerator() {
        return new GraduateEnumerator(this);
    }

}
