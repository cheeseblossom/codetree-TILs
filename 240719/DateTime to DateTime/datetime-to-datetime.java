import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 11, h = 11, m = 11;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;

        if ((a-d) + (b-h) + (c-m) < 0) {
            System.out.print(-1);
        }
        else {
            while (true) {
                if (d == a && h == b && m == c) {
                    break;
                }
                m++;
                result++;
                if (m == 60) {
                    m = 0;
                    h++;
                }
                if (h == 24) {
                    h = 0;
                    d++;
                }
            }
            System.out.print(result);
        }
    }
}