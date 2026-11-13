package Pattern_Printing;

import java.util.Scanner;

public class FlipTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/* 1) j<=n+1-i
2) j=n;j>=i;j--
3) use 2nd variable like above
4) int a=n; it is a 2nd variable then outer j loop keep a-- above last sout line
output : ****
         ***
         **
         *
 */