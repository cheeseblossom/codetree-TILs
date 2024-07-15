import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        System.out.print(printCount(a, result));
    }

    public static int printCount(int n, int result) {
        if (n == 1) {
            return result;
        }

        if (n % 2 == 0) {
            return printCount(n/2, result+1);
        }
        else {
            return printCount(n/3, result+1);
        }
    }
}