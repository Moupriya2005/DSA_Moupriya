package Pattern_Printing;

import java.util.Scanner;

public class SolidSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
