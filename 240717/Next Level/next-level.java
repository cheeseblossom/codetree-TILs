import java.util.Scanner;

class MyObject {
    String id;
    int level;
    public MyObject(String id, int level) {
        this.id = id;
        this.level = level;
    }
    public MyObject() {
        this.id = "codetree";
        this.level = 10;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        MyObject my1 = new MyObject();
        MyObject my2 = new MyObject(id, level);
        System.out.println("user " + my1.id + " lv " + my1.level);
        System.out.println("user " + my2.id + " lv " + my2.level);
    }
}