import java.util.Scanner;

public class Array2DSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
            for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (x == numbers[i][j]) {
                    System.out.print("Number is Located (" + i + " " + j +")");
                }
            }
        }
    }
}