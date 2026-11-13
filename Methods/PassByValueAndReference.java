package Methods;

public class PassByValueAndReference {
    static void change(int x){
        x=10;
    }
    static void main() {
        int x=6;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
/*
here in both case 6 printed because x value dont changes

 */