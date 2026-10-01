import java.util.Scanner;

public class Task_E {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println((a * b % 109 + 109)%109);
    }
}
