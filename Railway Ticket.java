import java.util.Scanner;

public class RailwayTicketCost {
    public static int calculateTotalCost(int age, int tickets) {
        int price;
        if (age >= 60) {
            price = 30;
        } else if (age <= 12) {
            price = 20;
        } else {
            price = 50;
        }
        return price * tickets;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter number of tickets: ");
        int tickets = scanner.nextInt();
        
        int totalCost = calculateTotalCost(age, tickets);
        System.out.println("Total cost for " + tickets + " tickets: " + totalCost);
    }
}
