package IF_Else;

import java.util.Scanner;

public class mag69 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        double n = sc.nextDouble();
        double mag=Math.abs(n);
        if(mag<69){
            System.out.println("smaller than 69");
        }
        else if(mag>69){
            System.out.println("larger than 69");
        }
        else{
            System.out.println("equal to 69");
        }
    }
}
