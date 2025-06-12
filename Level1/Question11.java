import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double quot = num1 / num2;
        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",
                num1, num2, sum, diff, prod, quot);
    }
}