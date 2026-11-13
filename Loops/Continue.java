package Loops;

public class Continue {
    static void main() {
        for (int i = 1; i <= 15; i++) {
            System.out.print(i+" ");
            if(i==13) continue;
            System.out.println("good morning");
        }
    }
}
