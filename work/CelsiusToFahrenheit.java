package codeprogrammingweek1;
import java.util.Scanner;
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter temprature in Celsius:");
		double celsius = scanner.nextDouble();
		double fahrenheit = (celsius * 9 / 5) + 32;	
		
		System.out.println("Temperature in Fahrenheit:" + fahrenheit);
		
        scanner.close();
	}

}
