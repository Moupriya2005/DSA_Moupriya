package Loops;

import java.util.Scanner;

public class APuptoN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=3*n-1;i+=3) {
            System.out.println(i);
        }
    }
}
// ending condition (a)n=a+(n-1)d=2+(n-1)3=3n-1
/* int a=2,d=3;
for(int i=1;i<=n;i++){
sout(a+" ");
a+=d;
 */
