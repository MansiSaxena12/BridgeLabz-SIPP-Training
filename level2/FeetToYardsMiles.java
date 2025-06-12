import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Output the result
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.5f\n",
                distanceInYards, distanceInMiles);

        input.close();
    }
}
