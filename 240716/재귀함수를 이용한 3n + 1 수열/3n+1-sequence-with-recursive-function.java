import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(printNum(a));
    }

    public static int printNum(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            n /= 2;
        }
        else {
            n = 3*n + 1;
        }
        return printNum(n) + 1;
    }
}