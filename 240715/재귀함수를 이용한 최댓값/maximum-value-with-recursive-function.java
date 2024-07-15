import java.util.Scanner;

public class Main {
    public static int[] arr = new int[100];
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maxValue(a-1));
    }
    
    public static int maxValue(int n) {
        if (n == 0) {
            return arr[0];
        }
        return Math.max(maxValue(n-1), arr[n]);
    }
}