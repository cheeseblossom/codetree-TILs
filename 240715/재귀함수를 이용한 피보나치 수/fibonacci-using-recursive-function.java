import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(printNum(a));
    }

    public static int printNum(int n) {
        if (n <= 2) {
            return 1;
        }
        return printNum(n-2) + printNum(n-1);
    }
}