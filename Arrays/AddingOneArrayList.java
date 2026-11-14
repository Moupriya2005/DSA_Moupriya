package Arrays;
import java.util.ArrayList;
public class AddingOneArrayList {
    static void main() {
        int[] arr = {1, 2, 9};

        ArrayList<Integer> ans = addOne(arr);

        System.out.println(ans);
    }
    static ArrayList<Integer> addOne(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                for (int j = 0; j < n; j++) {
                    result.add(arr[j]);
                }
                return result;
            }
            arr[i] = 0;
        }
        result.add(1);
        for (int i = 0; i < n; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
