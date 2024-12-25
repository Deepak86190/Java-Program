import java.util.*;
public class LL {
    public static void main(String[]args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0,10);
        list.add(1,35);
        list.add(2,26);
        list.add(3,43);
        list.add(4,18);
        list.add(5,22);
        list.add(6,23);
        System.out.println(list);
        System.out.println(list.indexOf(18));
        Collections.reverse(list);
        System.out.println(list);
// Remove
       // Scanner sc = new Scanner(System.in);

        //for (int i = 0; i <=5; i++) {
        //    list.add(i, sc.nextInt());
       // }

       // System.out.println(list);

        for (int i = list.size()-1; i >=0; i--) {
            if (list.get(i) > 25) {
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
