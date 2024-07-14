import java.util.Scanner;

public class Main {
    public static final int MAX = 100;
    public static int[] arr = new int[MAX];
    public static int result = 0;
    public static int n = 0;
    public static int m = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        while (m > 0) {
            cal(m);
        }
        System.out.print(result);
    }

    public static void cal(int a) {
        if (a % 2 == 0) {
            result += arr[a-1];
            m /= 2;
        }
        else {
            result += arr[a-1];
            m -= 1;
        }
    }
}