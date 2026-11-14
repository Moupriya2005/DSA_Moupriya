package Arrays;
import java.util.Arrays;
public class SortArrayBuiltIn {
    static void main() {
        // sort - ascending order
        int[] arr={4,2,7,8,-6,1};
        print(arr);
        Arrays.sort(arr);
    }
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
