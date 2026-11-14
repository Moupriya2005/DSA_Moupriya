package Arrays;

import java.util.Scanner;

public class RotateArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,89,9,90};
        int n=arr.length;
        int d=sc.nextInt();
        d%=n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    }

