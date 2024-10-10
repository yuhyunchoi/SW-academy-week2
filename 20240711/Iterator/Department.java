import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Department<T extends Student> implements Iterable<Student> {
    private int departmentNo;
    private String departmentName;

    List<Student> list = new ArrayList<>();

    public Department(int size){

    }

    public void add(T boy){
        this.list.add(boy);
    }

    

}
