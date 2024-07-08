import java.util.Scanner;

public class Main {
    public static int getCount(int a, int b) {
        int result = 0;
        for (int i=a; i<=b; i++) {
            if (i % 3 == 0 || isTSN(i))  {
                result++;
            }
        }
        return result;
    }

    public static boolean isTSN(int i) {
        while (i > 0) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                return true;
            }
            i = i / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getCount(a, b));
    }
}