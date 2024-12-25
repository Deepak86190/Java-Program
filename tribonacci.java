import java.util.Scanner;

public class tribonacci {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0;
        int b =1;
        int c =1;
        for(int i=3;i<=n;i++){
            int temp = a+b+c;
            System.out.println(temp);
            c = temp;
            b =c;
            a=b;
        }
    }
}
