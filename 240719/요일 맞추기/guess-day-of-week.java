import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] day = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int diff = numOfDays(m2, d2) - numOfDays(m1, d1);

        while (diff < 0) {
            diff += 7;
        }
        System.out.print(day[diff % 7]);
    }

    public static int numOfDays(int m, int d) {
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        // 1월부터 m-1월까지는 전부 계산
        for (int i=1; i<m; i++) {
            totalDays += days[i];
        }
        // m월은 d까지만
        totalDays += d;
        return totalDays;
    }
}