package Pattern_Printing;

import java.util.Scanner;

public class FlipTriangle5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/* for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
if(i+j<=n+1) sout("* ")
else sout(" ")
}
sout
}
 */