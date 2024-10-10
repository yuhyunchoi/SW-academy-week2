public class Guitarist {
    private int no;
    private String name;
    private String teamName;
    private String guitar;

    @Override
    public String toString(){
        return this.no + ", " + this.name + ", " + this.teamName +  ", " + this.guitar;
    }

    public Guitarist(int no, String name, String teamName, String guitar){
        this.no = no;
        this.name = name;
        this.teamName = teamName;
        this.guitar = guitar;
    }

    public static class Builder{
        private int no;
        private String name;
        private String teamName;
        private String guitar;

        public Builder no(int no){
            this.no = no;
            return this;
        }
        public Builder name(String name){
            this.name = name;
                return this;
        }
        public Builder teamName(String teamName){
            this.teamName = teamName;
            return this;
        }
        public Builder guitar(String guitar){
            this.guitar = guitar;
            return this;
        }

        public Guitarist build(){
            return new Guitarist(no, name, teamName, guitar);
        }



    }

    public static void main(String[] args) {
        Guitarist g1 = new Builder()
                    .no(1)
                    .name("Jimmy Page")
                    .teamName("Led Zepplin")
                    .guitar("Les Paul")
                    .build();


        System.out.println(g1.toString());




    }

}
