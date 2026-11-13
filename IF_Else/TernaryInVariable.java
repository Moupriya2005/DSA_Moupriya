package IF_Else;

import java.util.Scanner;

public class TernaryInVariable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int m=(n>=0)?100:0;
        System.out.print(m);
    }
}
