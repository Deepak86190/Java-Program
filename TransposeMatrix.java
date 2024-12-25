
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //Array
        int numbers[][] = new int[rows][cols];

        //input numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        //output numbers
        for (int j = 0; j < cols; j++) {
            for (int i= 0; i < rows; i++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}