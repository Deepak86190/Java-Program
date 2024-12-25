import java.util.*;
class Array_Largest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
            Arrays.sort(arr);
            int largest = arr[arr.length-1];
            int smallest = arr[0];
            System.out.println("Largest in given array is : " + largest);
            System.out.println("Smallest in given array is : " + smallest);
        System.out.println("Diff "+(largest-smallest));
    }
}

