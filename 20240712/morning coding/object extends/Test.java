public class Test {
    public static void main(String[] args) {
        Person jason = new Man("Jason");
        Person celine = new Woman("Celine");

        System.out.println(jason.getName() + " is a " + jason.getGender());
        jason.sayHello(jason);

        System.out.println(celine.getName() + " is a " + celine.getGender());
        celine.sayHello(celine);


    }
}
