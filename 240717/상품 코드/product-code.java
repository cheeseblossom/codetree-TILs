import java.util.Scanner;

class MyObject {
    String name;
    String code;
    public MyObject(String name, String code) {
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyObject my1 = new MyObject("codetree", "50");
        MyObject my2 = new MyObject(sc.next(), sc.next());
        System.out.println("product " + my1.code + " is " + my1.name);
        System.out.println("product " + my2.code + " is " + my2.name);
    }
}