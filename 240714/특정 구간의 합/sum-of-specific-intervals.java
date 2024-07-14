import java.util.Scanner;

public class Main {
    public static int MAX = 100;
    public static int[] arr = new int[MAX + 1];
    public static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i=1; i<n+1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j=a; j<=b; j++) {
                result += arr[j];
            }
            System.out.println(result);
            result = 0;
        }
    }
}