package Arrays;

public class MinimumElement {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        int min =arr[0]; // max=Integer.Max_Value
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min =arr[i];
            }
        }
        System.out.println(min);
    }
}
