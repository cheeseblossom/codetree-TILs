import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printDivideEven(sc);
    }

    public static void printDivideEven(Scanner sc) {
        int a = sc.nextInt();
        for (int i=0; i<a; i++) {
            int nextItem = sc.nextInt();
            if (nextItem % 2 == 0) {
                nextItem /= 2;
            }
            System.out.print(nextItem);
            if (i != a-1) {
                System.out.print(" ");
            }
        }
    }
}