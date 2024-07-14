import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String purpose = sc.nextLine();

        int r = check(input, purpose);
        System.out.print(r);
    }

    public static int check(String input, String purpose) {
        if (input.contains(purpose)) {
            return input.indexOf(purpose);
        }
        else {
            return -1;
        }
    }
}