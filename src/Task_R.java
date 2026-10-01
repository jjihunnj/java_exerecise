import java.util.Scanner;

public class Task_R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int remainder = k % n;
        int result = (n - remainder) % n;
        System.out.println(result);
    }
}