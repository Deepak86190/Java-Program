import java.util.*;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        System.out.println("Before Swap "+x +" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swap "+x +" "+y);
    }
}
