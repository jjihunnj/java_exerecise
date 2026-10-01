import java.util.Scanner;

public class Task_V {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int t = (a - b) / (a - b + 1000);
        System.out.println(a * (t + 1) + b * (-t));
    }
}