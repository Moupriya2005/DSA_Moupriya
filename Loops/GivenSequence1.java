package Loops;

import java.util.Scanner;

public class GivenSequence1 {
    static void main() {
        // take n print 1,n,2,n-1,3,n-2.....
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n/2; i++) {
            System.out.print(i+" "+(n-i+1)+" ");
        }
        if (n%2!=0) {
            System.out.print(n/2+1);
        }
    }
}
