import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int[] binary = new int[n.length()];
        for (int i=0; i<n.length(); i++) {
            binary[i] = n.charAt(i) - 48; // String charAt으로 int 변환 시 48을 빼야함
        }


        int num = 0;

        for (int i=0; i<n.length(); i++) {
            num = num * 2 + binary[i];
        }
        System.out.print(num);
    }
}