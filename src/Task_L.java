import java.util.Scanner;

public class Task_L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int h = (a / 3600)%24;
        int m = (a / 60);
        int s = (a - m*60) % 60;
        m = m%60;
        System.out.println(h + ":" + m/10 + m%10 + ":" + s/10 + s%10);

    }
}
