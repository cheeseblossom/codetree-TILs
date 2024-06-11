import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(isMagicNumber(input));
    }

    public static String isMagicNumber(int i) {
        int a = i / 10;
        int b = i % 10;
        if (i % 2 == 0 && (a+b) % 5 == 0) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
}