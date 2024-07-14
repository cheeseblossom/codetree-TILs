import java.util.Scanner;

public class Main {
    public static final int N = 50;
    public static int[] arr = new int[N];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
        }
        divideEven(a);
        for (int i=0; i<a; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void divideEven(int a) {
        for (int i=0; i<a; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] /= 2;
            }
        }
    }
}