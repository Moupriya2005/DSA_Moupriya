package Loops;

import java.util.Scanner;

public class PrimeOrNot {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count=0;
        for (int i=1; i<=n; i++) {
            if (n%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
