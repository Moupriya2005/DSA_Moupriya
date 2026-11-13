package Loops;

import java.util.Scanner;

public class CompositeOrNot {
    static void main() {
        // more than 2 factors between 2 to n-1 - composite
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       boolean flag=true;// true means prime
        for (int i = 2; i <Math.sqrt(n) ; i++) {
           if(n%i==0){
               flag=false; //false means composite
               break;
           }
        }
        if(n==1){
            System.out.println("neither prime nor composite");
        }
       else if(flag==false){
            System.out.println("composite number");
        }
        else{
            System.out.println("not composite number it is a prime number");
        }
    }
}
