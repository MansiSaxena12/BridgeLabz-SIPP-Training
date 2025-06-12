import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.printf("The distance of %.2f feet is %.2f yards and %.5f miles\n",
                distanceInFeet, distanceInYards, distanceInMiles);

    }
}
