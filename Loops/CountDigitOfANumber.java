package Loops;

import java.util.Scanner;

public class CountDigitOfANumber {
    static void main() {
       // when we don't know iteration number we use while loop
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n==0){
            System.out.println("0");
        }
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.print(count);
    }
}
