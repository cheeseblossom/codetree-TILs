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
        String str = String.valueOf(i);
        String regex = "(.*)[369](.*)";
        if (str.matches(regex)) {
            return true;
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