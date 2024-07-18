import java.util.Scanner;
import java.util.Arrays;

class MyObject implements Comparable<MyObject> {
    int x;
    int y;
    int num;
    public MyObject(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }

    @Override
    public int compareTo(MyObject my) {
        if ((Math.abs(this.x) + Math.abs(this.y)) == (Math.abs(my.x) + Math.abs(my.y))) {
            return this.num - my.num;
        }
        return (Math.abs(this.x) + Math.abs(this.y)) - (Math.abs(my.x) + Math.abs(my.y)) ;
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
            System.out.println(arr[i].num);
        }
    }
}