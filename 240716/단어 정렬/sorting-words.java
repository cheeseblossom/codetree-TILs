import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] words = new String[a];
        for (int i=0; i<words.length; i++) {
            words[i] = sc.next();
        }
        Arrays.sort(words);
        for (int i=0; i<words.length; i++) {
            System.out.println(words[i]);
        }
    }
}