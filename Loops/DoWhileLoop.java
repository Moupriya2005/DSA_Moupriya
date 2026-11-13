package Loops;

public class DoWhileLoop {
    static void main() {
        int i = 1;
        do{
            System.out.print(i+" ");
            i++;
        } while(i<=10);
    }
}
// if false condition came while never execute because it checks first
// but in do while false condition at least runs 1 time
/* infinite loop
 when condition is wrong and it always shows true
 ex: while(2<n) if i=1
 */