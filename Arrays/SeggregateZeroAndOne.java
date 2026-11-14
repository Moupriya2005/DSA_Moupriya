package Arrays;
import java.util.Arrays;
public class SeggregateZeroAndOne {
    static void segregateZeroAndOne(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            if(arr[i]==0) {
                i++;
            }
            else if(arr[j]==1) {
                j--;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }

    static void main() {
        int[] arr={0,1,0,1,0,1,0,1,0,1};
        segregateZeroAndOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*
Two pass solution :
for(int ele:arr){
if(ele==0) no of zero++;
}
for(int i=0;i<noof0;i++){
arr[i]=0;
}
for{
int i=noof0;i<arr.length;i--){
arr[i]=1;
}
 */