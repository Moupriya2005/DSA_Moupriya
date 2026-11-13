package Pattern_Printing;

import java.util.Scanner;

public class Rhombus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
               // triangle+square
                System.out.print(" "+" "); // space
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*"+" "); // star
            }
            System.out.println();
        }
    }
}
