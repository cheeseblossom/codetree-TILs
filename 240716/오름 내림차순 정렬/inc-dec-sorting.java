import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
        }
        printSort(arr);
    }

    public static void printSort(int[] arr) {
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(arr2, Collections.reverseOrder());
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}