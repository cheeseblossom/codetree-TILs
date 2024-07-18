import java.util.Scanner;
import java.util.Arrays;

class MyObject {
    String name;
    int height;
    int weight;
    public MyObject(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
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

        Arrays.sort(arr, (a, b) -> a.height - b.height);

        for (int i=0; i<n; i++) {
            System.out.println(arr[i].name + " " + arr[i].height + " " + arr[i].weight);
        }
    }
}