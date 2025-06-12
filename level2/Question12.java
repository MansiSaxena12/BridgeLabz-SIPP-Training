import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        double Area=0.5*num1*num2;
        double sqcm=Area*2.54;
        System.out.printf("The Area of triangle in sq is %.2f and in sqcm is %.2f", Area, sqcm);
    }
}
