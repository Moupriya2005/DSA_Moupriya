package Arrays;
import java.util.Arrays;
public class ShallowCopyDeepCopy {
    static void main() {
        int[] arr={10,20,30,40}; // contiguous allocation 16 byte
        int[] x=arr; // x is shallow copy af arr- not actual copy
        x[0]=100;
        System.out.println(arr[0]);
        int[] deep=Arrays.copyOf(arr,arr.length);// deep copy
        deep[0]=200; // deep is brand new array , dont change original array
        System.out.println(arr[0]);
    }
}
