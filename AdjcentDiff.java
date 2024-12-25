import java.util.*;
public class AdjcentDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[]= new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();}
        int sum = 0;
        int max =0;
        for(int i =0;i<size-1;i++){
                sum = sum + Math.abs(arr[i] - arr[i + 1]);}

                System.out.print(sum);
                }
    }

