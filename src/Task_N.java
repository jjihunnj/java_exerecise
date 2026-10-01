import java.util.Scanner;
public class Task_N {
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = (a * 45) + (15*((a-1)/2)) + ((a/2) * 5);
        int h = (b/60) + 9;
        int m = b%60;
        System.out.println(h + " " + m);
    }
}
