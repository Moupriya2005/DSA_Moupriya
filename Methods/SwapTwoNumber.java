package Methods;

public class SwapTwoNumber {
    static int[] swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        return new int[]{a,b};
    }
    static void main() {
        int a=10;
        int b=20;
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);
    }
}
// does not swaps
/*
swapping techniques -
1) using third variable
2) using +,-
3) using *,/
4) using bitwise XOR
 */