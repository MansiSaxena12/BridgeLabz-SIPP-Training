package codeprogrammingweek1;
import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length of rectangle:");
		double length = scanner.nextDouble();
		
		System.out.print("Enter width of rectangle:");
		double width = scanner.nextDouble();
		
		
		double perimeter = 2 * (length + width);
		
		System.out.println("The perimeter of the rectangle with length " + length + " and width " + width + " is: " + perimeter);
		scanner.close();

	}

}