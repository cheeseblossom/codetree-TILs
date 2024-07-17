import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class MyObject {
    String name;
    String addr;
    String city;
    public MyObject(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        MyObject[] my = new MyObject[a];
        for (int i=0; i<a; i++) {
            my[i] = new MyObject(sc.next(), sc.next(), sc.next());
        }

        Arrays.sort(my, new Comparator<MyObject>() {
            @Override
            public int compare(MyObject o1, MyObject o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println("name " + my[a-1].name);
        System.out.println("addr " + my[a-1].addr);
        System.out.println("city " + my[a-1].city);
    }
}