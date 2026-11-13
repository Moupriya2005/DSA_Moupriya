package IF_Else;


import java.util.Scanner;

public class TriangleCondition {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = input.nextInt();
        System.out.print("enter b: ");
        int b = input.nextInt();
        System.out.print("enter c: ");
        int c = input.nextInt();
        if(a+b>c && a+c>b && b+c>a) {
            System.out.println("The triangle is a valid");
        }
        else{
            System.out.println("The triangle is not a valid triangle");
        }
    }
}
