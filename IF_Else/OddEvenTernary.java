package IF_Else;

import java.util.Scanner;

public class OddEvenTernary {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // condition?true:false
        System.out.print((n%2==0)?"even":"odd");
    }
}
