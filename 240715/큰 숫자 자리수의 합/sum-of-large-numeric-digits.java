import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(printNum(a*b*c));
    }

    public static int printNum(int n) {
        if (n < 10) {
            return n;
        }
        return printNum(n/10) + n%10;
    }
}