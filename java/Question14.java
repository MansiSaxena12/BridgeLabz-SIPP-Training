import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fahrenheit: ");
        double num1 = input.nextDouble();

        double celsiusResult=(num1 - 32) * 5/9;
        System.out.printf(" The %.2f fahrenheit is %.2f celsius", num1, celsiusResult);
    }
}
