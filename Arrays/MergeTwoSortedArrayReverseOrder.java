
package Arrays;
import java.util.Arrays;

public class MergeTwoSortedArrayReverseOrder {

    static int[] merge(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int i = 0;
        int j = 0;
        int k = n + m - 1;

        while (i < n && j < m) {

            if (arr1[i] < arr2[j]) {
                result[k] = arr2[j];
                j++;
            }
            else {
                result[k] = arr1[i];
                i++;
            }

            k--;
        }

        while (i < n) {
            result[k] = arr1[i];
            i++;
            k--;
        }

        while (j < m) {
            result[k] = arr2[j];
            j++;
            k--;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {4,3,6,8,9};
        int[] arr2 = {9,3,5,7,1};

        int[] ans = merge(arr1, arr2);

        System.out.println(Arrays.toString(ans));
    }
}

