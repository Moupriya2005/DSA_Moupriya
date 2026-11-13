package Loops;

import java.util.Scanner;

public class SumOfNumberItsReverse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int rev=0;
        while(n>0) {
            sum=sum+(n%10);
            n=n/10;
        }
        while(sum>0) {
            rev=rev+(sum%10);
            sum=sum/10;
        }
        System.out.println("Reverse of the sum is: "+rev);
    }
}
