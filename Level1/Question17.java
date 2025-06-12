import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.printf("total salary:");
		double salary=sc.nextDouble();
		System.out.printf("total bonus:");
		double bonus = sc.nextDouble();
		double income= salary*bonus;
		System.out.printf("The salary is INR %.2f and the bonus is INR %.2f. Hence Total Income is INR %.2f", salary, bonus, income);
	}
}