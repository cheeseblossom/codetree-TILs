import java.util.Scanner;
import java.util.Arrays;

class MyObject {
    String name;
    int h;
    double w;
    public MyObject(String name, int h, double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        MyObject[] arr = new MyObject[n];
        for (int i=0; i<n; i++) {
            arr[i] = new MyObject(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        Arrays.sort(arr, (a, b) -> a.name.compareTo(b.name));
        System.out.println("name");
        for (int i=0; i<n; i++) {
            System.out.println(arr[i].name + " " + arr[i].h + " " + arr[i].w);
        }
        System.out.println();
        System.out.println("height");
        Arrays.sort(arr, (a, b) -> b.h - a.h);
        for (int i=0; i<n; i++) {
            System.out.println(arr[i].name + " " + arr[i].h + " " + arr[i].w);
        }
    }
}