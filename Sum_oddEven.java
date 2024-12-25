import java.util.*;

public class Sum_oddEven {
            public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sumOdd = 0;
            int sumEven = 0;

            // Converting integer to String
            String num = String.valueOf(n);

            // Traversing the String
            for(int i = 0; i < num.length(); i++){
                if (i % 2 == 0)
                    sumOdd = sumOdd + (num.charAt(i) - '0');
                else
                    sumEven = sumEven + (num.charAt(i) - '0');}

            System.out.println("Sum odd = " + sumOdd);
            System.out.println("Sum even = " + sumEven);
        }
    }
