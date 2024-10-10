import java.util.List;
import java.util.ArrayList;

public class Scenario {
    public static void main(String[] args) {
        buzz2.Say(buzz1, "너는 규칙을 위한했다.");
        buzz1.Say(buzz2, "나도 저랬던 건 아니겠지? ");

        System.out.println("책장에 진열된 버즈: ");
        for(Toy toy : shelf.shelf){
            System.out.println(toy);
        }

        List<Movable> list = new ArrayList<>();
        list.add(buzz1);
        list.add(buzz2);
        list.add(new AnimalTypeToy(1000, "pig 1" ,"pig"));

        for(Movable m : list){
            m.move();
        }

    
    
    }
    
}
