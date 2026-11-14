package Arrays;
import java.util.Arrays;
public class WaveArray {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        convertToWave(arr);

        System.out.println(Arrays.toString(arr));
    }
        static void convertToWave(int[] arr){
        for(int i=0;i<arr.length-1;i+=2){
            if(i==arr.length-1) break;
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}
