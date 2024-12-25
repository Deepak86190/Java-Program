import java.util.Scanner;

public interface FunctionTable {
    public static void Odd(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) total = total + i;

        }
        System.out.println(total);
    }



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Odd(n);

    }
}
