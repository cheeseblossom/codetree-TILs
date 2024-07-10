import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {
    public static void checkDate(int a, int b, int c) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String strB = b < 10 ? "0" + String.valueOf(b) : String.valueOf(b);
            String strC = c < 10 ? "0" + String.valueOf(c) : String.valueOf(c);
            sdf.setLenient(false);
            sdf.parse(String.valueOf(a) + strB + strC);
            if (b >= 3 && b <= 5) {
                System.out.println("Spring");
            }
            if (b >= 6 && b <= 8) {
                System.out.println("Summer");
            }
            if (b >= 9 && b <= 11) {
                System.out.println("Fall");
            }
            if (b == 12 || b <= 2) {
                System.out.println("Winter");
            }
        }
        catch (Exception e) {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        checkDate(a, b, c);
    }
}