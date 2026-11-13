package IF_Else;

import java.util.Scanner;

public class GreatestOf3 {
     static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a: ");
        int a = sc.nextInt();
        System.out.print("Enter the b: ");
        int b = sc.nextInt();
        System.out.print("Enter the c: ");
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("The greatest number is "+a);
        }
        else if(b>=a && b>=c){
            System.out.println("The greatest number is "+b);
        }
        else{
            System.out.println("The greatest number is "+c);
        }
    }
}
// in nested else , if-else condition lies under else
/* if(a>=b){
if(a>=c) sout(a);
else sout(c);
}
else{
if(b>=c) sout(b);
else sout(c);
}
 */
