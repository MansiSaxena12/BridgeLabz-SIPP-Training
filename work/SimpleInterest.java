package codeprogrammingweek1;

import java.util.Scanner;

public class SimpleInterest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Pricipal amount:");
		double principal = scanner.nextDouble();
		
		System.out.print("Enter the Rate of interest :");
		double rate = scanner.nextDouble();
		
		System.out.print("Enter the Time period in years:");
		double time = scanner.nextDouble();
		
		double simpleInterest = (principal * rate * time) / 100;
		
		System.out.println("The Simple Interest is:" + simpleInterest);
		scanner.close();

	}

}