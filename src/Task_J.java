import java.util.Scanner;

public class Task_J {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println((a+2)-a%2);
    }
}
