package IF_Else;

import java.util.Scanner;

public class DivBy5And3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n%5==0 && n%3==0) {
            System.out.println("Divisible by 3 and 5!");
        }
        else if (n % 5 == 0) { // n%5==0 && n%3!=0
            System.out.println("Divisible by 5!");
        }
        else if( n%3==0){ // n%3==0 && n%5!=0
            System.out.println("Divisible by 3 !");
        }
        else{ // without else can ok , can end with else if, condition- n%5!=0 && n%3!=0
            System.out.println("Not Divisible by 5 and 3!");
        }
    }
}

