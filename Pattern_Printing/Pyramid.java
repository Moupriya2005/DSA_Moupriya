package Pattern_Printing;

import java.util.Scanner;

public class Pyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
/* nsp nst method
int nsp=n-1(nsp-=1),nst=1(nst+=2)
all same just in above , just write nsp--,nst+=2 after 2 internal for loop
 */