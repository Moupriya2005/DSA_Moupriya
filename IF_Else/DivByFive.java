package IF_Else;

import java.util.Scanner;

public class DivByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n%5==0)
        {
            System.out.println("Divisible number by 5");
        }
        else
        {
            System.out.println("Not divisible number by 5");
        }
    }
}
