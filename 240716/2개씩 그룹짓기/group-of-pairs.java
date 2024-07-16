import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[2*a];
        for (int i=0; i<2*a; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int max = arr[0] + arr[2*a-1];
        for (int i=1; i<2*a-1; i++) {
            max = Math.max(max, arr[i] + arr[2*a-i-1]);
        }
        System.out.print(max);
    }
}