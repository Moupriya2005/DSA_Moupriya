package Basic;

public class Operator {
    static void main() {
        double x=5.0/2.0;
        System.out.println(x);
        char ch='a';
        System.out.println(ch);
        char ch2='b';
        System.out.println(ch2);
        char ch3='c';
        System.out.println(ch3);
        char ch4='d'; // one data type to another type is typecasting
        int z=ch4; //implicit type casting
        System.out.println(x);
        char ch5='e';
        int y=(int)ch5;//explicit typecasting
        System.out.println(y);
        char ch6='6';
        System.out.println((int)ch6);
        char ch7='f';
        System.out.println(ch7+0);
        int m=43;
        char ch8=(char)m;
        System.out.println(ch8);
    }
}
/* ASCII value of a=97, z=122,A=65,Z=90,0=48,9=57 */
/* BODMAS = (/,*,%) > (+,-)
++x,x++,--x,x--
 */