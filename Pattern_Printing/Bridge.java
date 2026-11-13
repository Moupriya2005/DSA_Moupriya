package Pattern_Printing;

import java.util.Scanner;

public class Bridge {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       for (int i = 1; i <= n; i++) {
           //left star
           for (int j = n; j >=i; j--) {
               System.out.print("* ");
           }
           //middle space
           for (int j = 1; j <= 2*(i-1); j++) {
               System.out.print("  ");
           }
           //right star
           for (int j = n; j >=i; j--) {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
