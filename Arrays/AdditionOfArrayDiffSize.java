package Arrays;
import java.util.Arrays;
public class AdditionOfArrayDiffSize {
    // {3,5,2,0,7}+{9,2,1}={3,6,1,2,8}
    static int[] addArrays(int[] arr1, int[] arr2) {
        int i=arr1.length-1;
        int j=arr2.length-1;
        int carry=0;
        int max=Math.max(arr1.length,arr2.length);
        int[] result=new int[max+1];
        int k=result.length-1;
        while(i>=0||j>=0||carry>0){
            int sum=carry;
            if(i>=0){
                sum+=arr1[i];
                i--;
            }
            if(j>=0){
                sum+=arr2[j];
                j--;
            }
            result[k]=sum%10;
            carry=sum/10;
            k--;
        }
        if(result[0]==0){
            return Arrays.copyOfRange(result,1,result.length);
        }
        return result;
    }

    static void main() {
        int[] arr1={3,5,2,0,7};
        int[] arr2={9,2,1};
        int[] ans=addArrays(arr1,arr2);
        System.out.println("sum: "+Arrays.toString(ans));
    }
}
