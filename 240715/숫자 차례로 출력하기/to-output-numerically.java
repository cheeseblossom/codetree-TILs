import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printNumber(a);
        System.out.println();
        printNumberReverse(a);
    }

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        printNumber(n-1);
        System.out.print(n + " ");
    }

    public static void printNumberReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumberReverse(n-1);
    }
}