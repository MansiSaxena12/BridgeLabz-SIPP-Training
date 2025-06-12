import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        double Perimeter=4*num1;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f", num1, Perimeter);
    }
}