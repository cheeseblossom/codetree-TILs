import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0) {
                Arrays.sort(arr, 0, i);
                System.out.print(arr[i/2] + " ");
            }
        }
    }
}