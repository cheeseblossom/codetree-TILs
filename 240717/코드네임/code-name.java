import java.util.Scanner;

class MyObject {
    String codeName;
    int score;

    public MyObject(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static final int IN = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyObject[] my = new MyObject[IN];

        for (int i=0; i<IN; i++) {
            my[i] = new MyObject(sc.next(), sc.nextInt());
        }

        MyObject min = my[0];
        for (int i=1; i<IN; i++) {
            if (min.score > my[i].score) {
                min = my[i];
            }
        }
        System.out.print(min.codeName + " " + min.score);
    }
}