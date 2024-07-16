import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedStr1 = new String(arr1);
        String sortedStr2 = new String(arr2);

        if (sortedStr1.equals(sortedStr2)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}