import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static void main(String args[]){
     ArrayList<Integer> list = new ArrayList<>();
       // add element
        list.add(0,0);
        list.add(1,5);
        list.add(2,2);
        list.add(3,1);
        list.add(4,9);
        System.out.println(list);

        // set element
        list.set(1,13);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        //Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
