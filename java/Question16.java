import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 of the Proncipal: ");
        double principal = input.nextDouble();
        System.out.print("Enter side 2 of the rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter side 3 of the time: ");
        double time = input.nextDouble();
        double simpleInterest=(principal*rate*time)/100;

        System.out.printf("The simpleInterest is %.2f for Proncipal %.2f,Rate of Interest %.2f and Time %.2f",simpleInterest,
        principal,rate, time);

    }
}
