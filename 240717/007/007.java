import java.util.Scanner;

class MyObject {
    String secret;
    String location;
    int time;
    public MyObject(String secret, String location, int time) {
        this.secret = secret;
        this.location = location;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secret = sc.next();
        String location = sc.next();
        int time = sc.nextInt();
        MyObject my = new MyObject(secret, location, time);
        System.out.println("secret code : " + my.secret);
        System.out.println("meeting point : " + my.location);
        System.out.println("time : " + my.time);
    }
}