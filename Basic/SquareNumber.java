package Basic;
import java.util.Scanner;
public class SquareNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        double square = n*n;
        System.out.println("Square of the number is "+square);
    }
}
