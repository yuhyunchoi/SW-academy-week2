import java.util.List;
import java.util.ArrayList;

public class Shelf {
    List<Toy> shelf = new ArrayList<>();

    void add(Toy toy){
        this.shelf.add(toy);
    }
}
