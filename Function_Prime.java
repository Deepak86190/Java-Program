import java.util.Scanner;

public class Function_Prime {
    public static int even(int a) {
        if (a % 2 == 0) {System.out.println("Even");
        }
        else{System.out.println("Odd");}
return 0;
    }
        public static void main(String[]args){
            Scanner sc =new Scanner(System.in);
            int a = sc.nextInt();
            even(a);
        }
}
