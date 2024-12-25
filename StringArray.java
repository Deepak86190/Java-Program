import java.util.*;
public class StringArray {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int total =0;

        String Strings[] = new String[size];

        for(int i=0;i<size;i++){
            Strings[i] = sc.next();
            total +=Strings[i].length();
            Arrays.sort(Strings,String.CASE_INSENSITIVE_ORDER);
            System.out.println(Strings);
        }


        System.out.println(total);

    }
}
