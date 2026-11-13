package IF_Else;

import java.util.Scanner;

public class IntegerOrNot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n = sc.nextDouble();
        int x=(int)n;
        if(n-x==0){
            System.out.println("is an integer");
        }
        else{
            System.out.println("not an integer");
        }
    }
}
