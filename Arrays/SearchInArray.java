package Arrays;

import java.util.Scanner;

public class SearchInArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int found=-1;
       int[] arr={1,2,3,4,5,6,7,8,9,10};
       for(int i=0;i<arr.length;i++) {
           if(arr[i]==n) {
               found=i;
               break;
           }
       }
       if(found!=-1) {
           System.out.println("found");
       }
       else{
           System.out.println("not found");
       }
    }
}
