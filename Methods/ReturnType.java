package Methods;

public class ReturnType {
    static int mou(int a){
        System.out.println("priya");
       if(a>0) return 2;
       else return 10;
    }
    static void main() {
        System.out.println(mou(-9));
        int x=mou(7);
        System.out.print(4+x);
    }
}
/* return is mandatory
if we give if statement then we have to give else statement also
because if 1st statement can't run then else statement will run.
 */