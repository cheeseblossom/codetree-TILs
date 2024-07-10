import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {
    public static void checkDate(int a, int b) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String strA = a < 10 ? "0" + String.valueOf(a) : String.valueOf(a);
            String strB = b < 10 ? "0" + String.valueOf(b) : String.valueOf(b);
            sdf.setLenient(false);
            sdf.parse("2021" + strA + strB);
            System.out.println("Yes");
        }
        catch (Exception e) {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        checkDate(a, b);
    }
}