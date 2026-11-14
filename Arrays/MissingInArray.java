package Arrays;


public class MissingInArray {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5,7};
        long n= arr.length+1;
        long Sum=(n*(n+1))/2;
        long ArraySum=0;
        for(int ele:arr){
            ArraySum+=ele;
        }
        System.out.println(Sum-ArraySum);
    }
}
