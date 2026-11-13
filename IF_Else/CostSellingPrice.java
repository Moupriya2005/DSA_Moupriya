package IF_Else;

import java.util.Scanner;

public class CostSellingPrice {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the selling price: ");
        double price = sc.nextDouble();
        System.out.print("Enter the cost of the cost price: ");
        double cost = sc.nextDouble();
        // here we use else if ladder
        if (price > cost) {
            System.out.println("profit");
            System.out.println("profit is: "+(price-cost));
        }
        else if (price == cost) {
            System.out.println("not valid");
        }
        else {
            System.out.println("loss");
            System.out.println("Loss is: "+(cost-price));
        }
    }
}
// we can also use 3 consecutive if condition here
