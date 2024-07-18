import java.util.Scanner;
import java.util.Arrays;

class MyObject implements Comparable<MyObject> {
    int height;
    int weight;
    int num;
    public MyObject(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(MyObject my) {
        if (this.height == my.height) {
            if (this.weight == my.weight) {
                return this.num - my.weight;
            }
            return my.weight - this.weight;
        }
        return my.height - this.height;
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
            System.out.println(arr[i].height + " " + arr[i].weight + " " + arr[i].num);
        }
    }
}