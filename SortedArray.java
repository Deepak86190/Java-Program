import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //input size
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // input numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        //print numbers
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        boolean isAscending = true;
        for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
            if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
                isAscending = false;
            }
        }


        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}