package IF_Else;

import java.util.Scanner;

public class FourDigitOrNot {
    // &&- logical and,||-logical or
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        if(n>999 && n<10000){
            System.out.println("4 digit number");
        }
        else{
            System.out.println("not a 4 digit number");
        }
    }
}
