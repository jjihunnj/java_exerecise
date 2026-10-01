import java.util.Scanner;

public class Task_U {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        long r1 = n % m;
        long r2 = m % n;

        long product = r1 * r2;
        System.out.println(1 / (product + 1));
    }
}