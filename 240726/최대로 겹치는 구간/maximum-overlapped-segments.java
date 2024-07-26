import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 겹치는 구간을 찾으므로 [x1, x2]에 대해  x1부터 x2 - 1까지 표기한다
        // 음수를 갖기 때문에 OFFSET을 더한 후 진행한다
        int OFFSET = 100;
        int[] x1 = new int[100];
        int[] x2 = new int[100];
        int[] arr = new int[201];

        for (int i=0; i<n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

            x1[i] += OFFSET;
            x2[i] += OFFSET;
        }

        // 구간 구하기
        for (int i=0; i<n; i++) {
            for (int j=x1[i]; j<x2[i]; j++) {
                arr[j]++;
            }
        }

        // 최댓값
        int max = 0;
        for (int i=0; i<=200; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}