import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (check(str)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }

    public static boolean check(String s) {
        if (s.length() == 1) {
            return false;
        }
        char c = s.charAt(0);
        for (int i=1; i<s.length(); i++) {
            if (c != s.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}