import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[a];
        for (int i=0; i<a; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i=0; i<a; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean check = true;
        for (int i=0; i<a; i++) {
            if (arr1[i] != arr2[i]) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}