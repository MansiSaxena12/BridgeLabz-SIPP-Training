import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.printf("total pounds:");
		double pounds=sc.nextDouble();
		
		double kilo= 2.2*pounds;
		System.out.printf(" The weight of the person in pounds is %.2f and in kg is %.2f", pounds,kilo);
	}
}