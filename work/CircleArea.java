package codeprogrammingweek1;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter radius of circle:");
		double radius = scanner.nextDouble();
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("The area of the circle with radius " + radius + " is: " + area);
		scanner.close();

	}

}
