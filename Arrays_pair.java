import java.util.*;
public class Arrays_pair {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int size =sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }

        int target =sc.nextInt();
        int n =arr.length;

        int count = 0;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count++;

                }

            }
        }
        System.out.println(count);
    }
}
