import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] input = str.split(" ");
        System.out.println(gcd(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
    }

    public static int gcd(int a, int b) {
        int result = 1;
        for (int i=1; i<=a && i<=b; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }
}