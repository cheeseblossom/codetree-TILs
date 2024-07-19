import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        boolean isReverse = false;
        if (m1 > m2) {
            isReverse = true;
            int temp = m1;
            m1 = m2;
            m2 = temp;
            temp = d1;
            d1 = d2;
            d2 = d1;
        }
        else if (m1 == m2) {
            if (d1 > d2) {
                isReverse = true;
                int temp = d1;
                d1 = d2;
                d2 = temp;
            }
        }
        int gap = 0;
        while (true) {
            if (m1 == m2 && d1 == d2) {
                break;
            }
            d1++;
            gap++;
            if (d1 == arr[m1]) {
                d1 = 1;
                m1++;
            }
        }

        if (isReverse) {
            gap %= 7;
            if (gap < 2) {
                gap = 7 + gap;
            }
            System.out.print(day[8-gap]);
        }
        else {
            gap %= 7;
            if (gap == 6) {
                gap = -1;
            }
            System.out.print(day[gap+1]);
        }
    }
}