package Pattern_Printing;

import java.util.Scanner;

public class StarTriangleVerticallyFlipped {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               if(i+j>n) System.out.print("* ");
               else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
/* for(int i=1;i<=n;i++){
     for(int j=1;j<=n-i;j++){
         sout("  ");
        }
     for(int j=1;j<=i;j++){
         sout("* ");
        }
     sout();
        }
 */
