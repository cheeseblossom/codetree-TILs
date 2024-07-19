import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] days = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day = sc.next();

        int index = 0;
        for (int i=0; i<days.length; i++) {
            if (days[i].equals(day)) {
                index = i;
                break;
            }
        }

        d1 += index;

        int[] dates = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;
        while (true) {
            if (m1 == m2 && d1 >= d2) {
                break;
            }
            d1 += 7;
            result++;
            if (dates[m1] < d1) {
                d1 = 1;
                m1++;
            }
        }
        System.out.print(result);
    }
}