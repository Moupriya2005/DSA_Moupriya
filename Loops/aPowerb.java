package Loops;

import java.util.Scanner;

public class aPowerb {
    static void main() {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        System.out.print("Enter power number: ");
        b = sc.nextInt();
        int pow=1;
        for(int i=1;i<=b;i++){
            pow*=a;
        }
        System.out.println(a+" raised to the power of "+b+" is "+pow);
    }

}
