package Arrays;

public class ReverseArray {
    // two pointer technique
    static void main() {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.println(ele+" ");
        }
    }
}
/* reverse part of array- i start from starting part,
                          j start from ending part
 */