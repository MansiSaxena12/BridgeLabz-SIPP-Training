package codeprogrammingweek1;
import java.util.Scanner;

public class CylinderVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter radius of cylinder:");
		double radius = scanner.nextDouble();
		
		System.out.print("Enter height of cylinder:");
		double height = scanner.nextDouble();
		
		
		double volume = Math.PI * Math.pow(radius, 2)* height;
		
		System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);
		scanner.close();

	}

}