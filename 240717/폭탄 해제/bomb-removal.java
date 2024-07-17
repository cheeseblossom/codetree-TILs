import java.util.Scanner;

class MyObject {
    String code;
    String color;
    int second;

    public MyObject(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyObject my = new MyObject(sc.next(), sc.next(), sc.nextInt());
        System.out.println("code : " + my.code);
        System.out.println("color : " + my.color);
        System.out.println("second : " + my.second);
    }
}