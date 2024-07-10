import java.util.Scanner;

public class Main {
    public static boolean isPart(String a, String b) {
        if (a.contains(b)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthA = sc.nextInt();
        int lengthB = sc.nextInt();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (int i=0; i<lengthA; i++) {
            a.append(String.valueOf(sc.nextInt()));
        }
        for (int i=0; i<lengthB; i++) {
            b.append(String.valueOf(sc.nextInt()));
        }
        if (isPart(a.toString(), b.toString())) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}