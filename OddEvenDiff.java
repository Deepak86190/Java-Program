import java.util.*;
public class OddEvenDiff {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int even =0;
        int odd =0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            System.out.print(arr[i]+" ");

            if (arr[i]%2==0){
                even = even + arr[i];}
            else{
                odd = odd+arr[i];}
            }
        System.out.println("Diff :" +Math.abs(even - odd));

        }

    }






















