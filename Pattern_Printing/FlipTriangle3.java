package Pattern_Printing;

import java.util.Scanner;

public class FlipTriangle3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
