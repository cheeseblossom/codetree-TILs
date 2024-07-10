import java.util.Scanner;

public class Main {
    public static boolean isYoonYear(int n) {
        if (n % 4 == 0 && n % 100 == 0 && n % 400 == 0) {
            return true;
        }
        else if (n % 4 == 0 && n % 100 == 0) {
            return false;
        }
        else if (n % 4 == 0) {
            return true;
        }
        return false;
    }
    public static boolean isValidDate(int y, int m, int d) {
        if (m == 2) {
            if (isYoonYear(y)) {
                if (d > 29) {
                    return false;
                }
            }
            else {
                if (d > 28) {
                    return false;
                }
            }
        }
        else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d > 31) {
                return false;
            }
        }
        else  {
            if (d > 30) {
                return false;
            }
        }
        return true;
    }

    public static void checkDate(int y, int m, int d) {
        if (isValidDate(y, m, d)) {
            if (3 <= m && m <= 5) {
                System.out.println("Spring");
            }
            else if (6 <= m && m <= 8) {
                System.out.println("Summer");
            }
            else if (9 <= m && m <= 11) {
                System.out.println("Fall");
            }
            else {
                System.out.println("Winter");
            }
        }
        else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        checkDate(year, month, day);
    }
}