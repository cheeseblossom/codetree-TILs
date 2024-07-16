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

        boolean check = true;
        for (int i=0; i<arr1.length; i++) {
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