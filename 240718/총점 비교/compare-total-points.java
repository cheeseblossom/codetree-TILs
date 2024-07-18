import java.util.Scanner;
import java.util.Arrays;

class MyObject implements Comparable<MyObject> {
    String name;
    int kor;
    int eng;
    int math;
    public MyObject(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(MyObject my) {
        return (this.kor + this.eng + this.math) - (my.kor + my.eng + my.math);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyObject[] arr = new MyObject[n];
        for (int i=0; i<n; i++) {
            arr[i] = new MyObject(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            System.out.println(arr[i].name + " " + arr[i].kor + " " + arr[i].eng + " " + arr[i].math);
        }
    }
}