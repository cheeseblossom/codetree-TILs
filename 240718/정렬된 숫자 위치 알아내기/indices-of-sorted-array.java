import java.util.Scanner;
import java.util.Arrays;

class MyObject {
    int value;
    int num;
    public MyObject(int value, int num) {
        this.value = value;
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyObject[] arr = new MyObject[n];
        for (int i=0; i<n; i++) {
            arr[i] = new MyObject(sc.nextInt(), i+1);
        }
        Arrays.sort(arr, (a, b) -> a.value - b.value);
        int[] arr2 = new int[n+1];
        for (int i=0; i<n; i++) {
            arr2[arr[i].num] = i+1;
        }
        for (int i=1; i<=n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}