package Basic;
import java.util.Scanner;
public class VolumeCircle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int r;
        r=sc.nextInt();
        double vol=((3.14*r*r*r)*4)/3;
        System.out.println(vol);
    }
}
