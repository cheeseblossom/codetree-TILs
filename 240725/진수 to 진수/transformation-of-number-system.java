import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();

        int temp = 0;
        // a진수 -> 10진수
        for (int i=0; i<n.length(); i++) {
            temp = temp * a + (n.charAt(i) - '0');
        }

        int cnt = 0;
        int[] arr = new int[50];
        // 10진수 -> b진수
        while (true) {
            if (temp < b) {
                arr[cnt++] = temp;
                break;
            }
            arr[cnt++] = temp % b;
            temp /= b;
        }

        for (int i=cnt-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}