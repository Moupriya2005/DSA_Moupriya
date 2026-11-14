package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {
    static void main() {
        ArrayList<Integer> arr=new ArrayList<>(); // also string, double used
        // arraylist - dynamic array, size can change
        arr.add(1);// adding element
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.get(0));// for accessing
        arr.set(0,6); // rewrite // also can use 'add'
        // array- length calculates
        // arrayList - calculate size
        int n=arr.size();
        System.out.println(n);
        for(int ele:arr){
            System.out.println(ele);
        }
        arr.remove(arr.size()-1);// remove last element
        Collections.reverse(arr); // reverse
        // reverse in other way
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
    }
}
