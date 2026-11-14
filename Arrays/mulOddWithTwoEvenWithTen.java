package Arrays;

public class mulOddWithTwoEvenWithTen {
    static void main() {
        int[]arr={10,7,9,56,7,8,45,67,59};
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0) {
                System.out.print((10+arr[i])+" ");
            }
            else {
                System.out.print(2*arr[i]+" ");
            }
        }
    }
}
