import java.util.Scanner;

public class Task_I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a/100;
        int c = a%10;
        int d = a/10%10;
        System.out.println(b+c+d);
    }
}
