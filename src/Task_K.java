import java.util.Scanner;

public class Task_K {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int h = a/60;
        int m = a%60;
        h = h%24;
        System.out.println(h + " " + m);
    }
}
