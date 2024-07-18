import java.util.Scanner;
import java.util.Arrays;

class MyObject implements Comparable<MyObject> {
    String name;
    int h;
    int w;
    public MyObject(String name, int h, int w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(MyObject my) {
        if (this.h == my.h) {
            return my.w - this.w;
        }
        return this.h - my.h;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyObject[] arr = new MyObject[n];
        for (int i=0; i<n; i++) {
            arr[i] = new MyObject(sc.next(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            System.out.println(arr[i].name + " " + arr[i].h + " " + arr[i].w);
        }
    }
}