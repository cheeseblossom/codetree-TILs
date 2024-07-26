import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[100];
        int[] x2 = new int[100];
        int[] arr = new int[100];

        for (int i=0; i<n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        // 구간 구하기
        for (int i=0; i<n; i++) {
            for (int j=x1[i]; j<=x2[i]; j++) {
                arr[j]++;
            }
        }

        // 최댓값
        int max = 0;
        for (int i=0; i<100; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}