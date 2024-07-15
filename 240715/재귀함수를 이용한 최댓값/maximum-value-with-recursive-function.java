import java.util.Scanner;

public class Main {
    public static int[] arr = new int[101];
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(find(a));
    }

    public static int find(int n) {
        int num = arr[cnt];

        if (cnt == n) {
            return n;
        }

        cnt++;
        if (num > n) {
            return find(num);
        }
        else {
            return find(n);
        }
    }


}