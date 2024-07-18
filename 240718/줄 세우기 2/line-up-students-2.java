import java.util.Scanner;
import java.util.Arrays;

class MyObject implements Comparable<MyObject> {
    int h;
    int w;
    int n;
    public MyObject(int h, int w, int n) {
        this.h = h;
        this.w = w;
        this.n = n;
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
            arr[i] = new MyObject(sc.nextInt(), sc.nextInt(), i+1);
        }
        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            System.out.println(arr[i].h + " " + arr[i].w + " " + arr[i].n);
        }
    }
}