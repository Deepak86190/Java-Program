import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height in Meter");
        double height = sc.nextDouble();
        System.out.println("Enter Weight in Kg ");
        int weight = sc.nextInt();
        double index = weight / (height * height);
        System.out.println("BMI Index: "+index);

    }
}
