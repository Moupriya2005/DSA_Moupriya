package Arrays;

public class MergeTwoSortedArray {
    static void main() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3=new int[arr1.length+arr2.length];
        merge(arr3,arr1,arr2);
        for(int ele:arr3){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void merge(int[] arr3, int[] arr1, int[] arr2) {
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else{
                arr3[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            arr3[k++] = arr1[i++];
        }

            while(j<arr2.length){
                arr3[k++] = arr2[j++];
            }

    }
}
