import java.util.Scanner;

public class Task_M {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }
}
