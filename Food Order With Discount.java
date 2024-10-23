import java.util.Scanner;

public class FoodOrder {
    public static double calculateOrderTotal(int choice, int quantity) {
        int price = 0;
        switch (choice) {
            case 1:
                price = 200; // Pizza
                break;
            case 2:
                price = 100; // Burger
                break;
            case 3:
                price = 150; // Dosa
                break;
            case 4:
                price = 250; // Briyani
                break;
            case 5:
                price = 200; // Chicken Rice
                break;
            default:
                System.out.println("Invalid choice");
                return 0;
        }

        double total = price * quantity;
        System.out.println("Total cost before discount: Rs. " + total);
        if (total > 500) {
            double discount = total * 0.1;
            total -= discount;
            System.out.println("Discount applied: Rs. " + discount);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        double total = calculateOrderTotal(choice, quantity);
        System.out.println("Total cost after discount: Rs. " + total);
    }
}
