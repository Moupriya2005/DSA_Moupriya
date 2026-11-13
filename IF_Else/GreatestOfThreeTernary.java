package IF_Else;

import java.util.Scanner;

public class GreatestOfThreeTernary {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a: ");
        int a = sc.nextInt();
        System.out.print("Enter the b: ");
        int b = sc.nextInt();
        System.out.print("Enter the c: ");
        int c = sc.nextInt();
        int greatest=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.print(greatest);
    }
}
