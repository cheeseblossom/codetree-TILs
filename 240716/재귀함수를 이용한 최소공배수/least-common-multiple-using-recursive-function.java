import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(getLCM(arr));
    }

    public static int getGCD(int n, int m) {
        if (m == 0) {
            return n;
        }
        return getGCD(m, n%m);
    }

    public static int getLCM(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int gcd = getGCD(arr[0], arr[1]);
        int lcm = (arr[0] * arr[1]) / gcd;
        for (int i=2; i<arr.length; i++) {
            gcd = getGCD(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }
        return lcm;
    }
}