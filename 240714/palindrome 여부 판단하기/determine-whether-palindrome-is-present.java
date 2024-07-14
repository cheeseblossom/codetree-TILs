import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (isPalindrome(str)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(String s) {
        int middlePoint = s.length() / 2;
        for (int i=0; i<middlePoint; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}