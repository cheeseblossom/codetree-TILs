import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(printSquare(a));
    }

    public static int printSquare(int n) {
        if (n < 10) {
            return n*n;
        }
        return printSquare(n/10) + (n%10)*(n%10);
    }
}