import java.util.Scanner;

class MyObject {
    String ymd;
    String day;
    String weather;
    public MyObject(String ymd, String day, String weather) {
        this.ymd = ymd;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        MyObject[] my = new MyObject[a];
        MyObject[] rain = new MyObject[a];
        for (int i=0; i<a; i++) {
            my[i] = new MyObject(sc.next(), sc.next(), sc.next());
        }

        MyObject result = null;
        for (int i=0; i<a; i++) {
            if (my[i].weather.equals("Rain")) {
                if (result == null) {
                    result = my[i];
                }
                else {
                    if (result.ymd.compareTo(my[i].ymd) > 0) {
                        result = my[i];
                    }
                }
            }
        }
        System.out.print(result.ymd + " " + result.day + " " + result.weather);
    }
}