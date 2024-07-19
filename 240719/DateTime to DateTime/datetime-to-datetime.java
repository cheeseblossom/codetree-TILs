import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 11, h = 11, m = 11;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = (a * 24 * 60 + b * 60 + c) - (11 * 24 * 60 + 11 * 60 + 11);
        if (result < 0) {
            System.out.print(-1);
        }
        else {
            System.out.print(result);
        }
    }
}