import java.util.Scanner;

public class Main {
    public static boolean isYoonYear(int n) {
        if (n % 100 == 0 && n % 400 != 0) {
            return false;
        }
        if (n % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isYoonYear(a));
    }
}