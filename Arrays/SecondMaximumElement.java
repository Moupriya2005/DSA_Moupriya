package Arrays;
import java.util.Arrays;
public class SecondMaximumElement {
    static void main() {
        int[] arr = { 1, 2, 3, 4, 5, 6,9, 7, 8, 9 };
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>smax && arr[i]!=max) {
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}
