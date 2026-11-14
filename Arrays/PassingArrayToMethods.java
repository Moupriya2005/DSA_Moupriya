package Arrays;

public class PassingArrayToMethods {
    static void main() {
        int[] x={10,3,29,38};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    static void change(int[] x){ // reference variable
        x[2]=99;
    }
}
