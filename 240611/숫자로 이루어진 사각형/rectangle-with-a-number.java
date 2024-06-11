import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        printRect(rowNum);
    }

    public static void printRect(int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int currentIdx = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[currentIdx]);
                System.out.print(" ");
                currentIdx++;
                if (currentIdx == 9) {
                    currentIdx = 0;
                }
            }
            System.out.println();
        }
    }

}