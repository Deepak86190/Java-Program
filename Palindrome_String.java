import java.util.*;
import java.util.Scanner;
public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        for (int i=str.length()-1;i>=0;--i){
            rev = rev +str.charAt(i);
        }
        System.out.println(rev);
        
        if (str.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}