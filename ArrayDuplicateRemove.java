import java.util.*;
public class ArrayDuplicateRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //Imp
        int arr2[]=Arrays.stream(arr).distinct().toArray();
        for(int i:arr2){
            System.out.print(i+" ");
        }

    }
}
