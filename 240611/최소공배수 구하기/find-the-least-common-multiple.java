import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 * num2 / gcd(num1, num2));
    }

    public static int gcd(int num1, int num2) {
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }
        return max;
    }
}