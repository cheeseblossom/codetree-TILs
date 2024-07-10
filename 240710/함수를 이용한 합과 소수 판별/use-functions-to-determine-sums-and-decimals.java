import java.util.Scanner;

public class Main {
    public static boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }
        else if (i == 2) {
            return true;
        }
        for (int j=2; j<i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSumEven(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            int m = i / 10;
            i = m;
        }
        if (sum % 2 == 0) {
            return true;
        }
        return false;
    }
    public static boolean isMaginNum(int i) {
        if (isPrime(i) && isSumEven(i)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        for (int i=a; i<=b; i++) {
            if (isMaginNum(i)) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}