import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price of the item (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity to be bought: ");
        int quantity = input.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and the unit price is INR %.2f\n",
                totalPrice, quantity, unitPrice);
    }
}
