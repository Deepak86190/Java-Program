import java.sql.SQLOutput;
import java.util.Scanner;

public class Prime1 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
           // System.out.println("Not Prime Number");
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                //System.out.println("Not Prime Number");
                return false;
            }
        }
        //System.out.println("Prime Number");
        return true;
    }
public static int sumofPrime(int n){
        int sum =0;
        for(int i =0;i<n;i++){
            if(isPrime(i)){
                sum+=i;
                            }
        }
        return sum;

}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //isPrime(n);
        System.out.println("Sum "+ sumofPrime(n));
    }
}
