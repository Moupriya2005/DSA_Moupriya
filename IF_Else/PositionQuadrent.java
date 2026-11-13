package IF_Else;

import java.util.Scanner;

public class PositionQuadrent{
    // check point where if it is in 1st,2nd,3rd,4th Quadrant or in x,y axis , origin
    static void main() {
      Scanner sc = new Scanner(System.in);
        System.out.print("enter x: ");
        int x = sc.nextInt();
        System.out.print("enter y: ");
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("origin");
        }
        else if(x==0){
            System.out.println("x axis");
        }
        else if(y==0){
            System.out.println("y axis");
        }
        else if(x>0 && y>0){
            System.out.println("1st quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("2nd quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("3rd quadrant");
        }
        else{
            System.out.println("4th quadrant");
        }
    }
}

