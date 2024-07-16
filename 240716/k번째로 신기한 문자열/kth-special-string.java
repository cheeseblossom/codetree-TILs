import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] arr = new String[n];
        String[] arr2 = new String[n];
        int count = 0;
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextLine();
            if (arr[i].startsWith(t)) {
                arr2[count] = arr[i];
                count++;
            }
        }
        Arrays.sort(arr2, Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.print(arr2[k-1]);
    }
}