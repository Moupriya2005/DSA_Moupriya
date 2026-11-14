package Arrays;

import java.util.Scanner;

public class ArrayBasic {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] x= {6,19,7,69,9,171,5};// indexing and initialization
        System.out.println(x[0]);// accessing element
        x[3]=89; // updating
        System.out.println(x[3]);
        int[] arr=new int[3]; // declaring size of array
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        int n=arr.length; // 0 to n-1
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        int i=0;
        while(i<=n-1) {
            System.out.print(2*arr[i]+" ");
            // we also can do arithmetic operations with the values.
            i++;
        }
        //<=5 == <6
        int[] y=new int[7];
        for(int j=0;j<7;j++) {
            System.out.println(y[j]+" "); // if we dont give any input in array then default value given it is 0
        }
        // for giving input in array using loop
        for(int j=0;j<7;j++) {
            int z=sc.nextInt();
            y[j]=z; // y[j]=sc.nextInt();
        }

    }
}
