package IF_Else;

import java.util.Scanner;

public class LeastOfThree {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        if(a<=b && a<=c){
            System.out.println("Least of three is "+a);
        }
        else if(b<=a && b<=c){
            System.out.println("Least of three is "+b);
        }
        else{
            System.out.println("Least of three is "+c);
        }
    }
}
