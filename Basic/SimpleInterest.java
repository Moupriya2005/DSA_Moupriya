package Basic;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the p : ");
        double p = sc.nextDouble();
        System.out.print("Enter the r: ");
        double r = sc.nextDouble();
        System.out.print("Enter the t: ");
        double t = sc.nextDouble();
        double si=p*r*t/100;
        System.out.println("The interest is "+si);
    }
}
