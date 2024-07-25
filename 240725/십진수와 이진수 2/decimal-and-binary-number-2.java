import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int temp = 0;
        
        // 2진수 -> 10진수
        for (int i=0; i<n.length(); i++) {
            temp = temp * 2 + (n.charAt(i) - '0');
        }
        temp *= 17;

        // 10진수 -> 2진수
        int cnt = 0;
        int[] arr = new int[20];
        while (true) {
            if (temp < 2) {
                arr[cnt++] = temp;
                break;
            }
            arr[cnt++] = temp % 2;
            temp /= 2;
        }

        for (int i=cnt-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}