import java.util.Scanner;

public class Rev_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev =0;
        int number =n;
        for(;n != 0; n = n/10)
        {
           int rem = n % 10;
             rev = rev * 10 + rem;
        }
        System.out.println(rev);
// paindome number
        if(number == rev)
            System.out.println("Paindrome");

        else
            System.out.println("Not Palindrome");


        // Sum of digit
        int num = rev;
        int sum =0;
        for(;num!=0;num=num/10){
            int remainder = num%10;
            sum = sum + remainder;
        }
        System.out.println(sum);
    }
}