package IF_Else;

import java.util.Scanner;

public class RecAreaParameter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter l: ");
        int l = sc.nextInt();
        System.out.print("enter b: ");
        int b = sc.nextInt();
        double area = l * b;
        double peri = area * 0.5;
        if (area > peri) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
