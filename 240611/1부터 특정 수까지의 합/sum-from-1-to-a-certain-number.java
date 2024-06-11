import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = (input * (input+1)) / 2;
        System.out.println(result / 10);
    }
}