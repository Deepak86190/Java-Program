import java.sql.SQLOutput;

public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        str.setCharAt(0,'M');
        System.out.println(str);
        str.append(" World");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
            }
}
