package src.Lesson;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Balinizi daxil edin: ");
        int bal = sc.nextInt();

        if (bal <= 50) {
            System.out.println(" Sizin baliniz F'dir ");
        } else if (bal < 61) {
            System.out.println(" Sizin baliniz D'dir ");
        } else if (bal < 71) {
            System.out.println(" Sizin baliniz C'dir ");
        } else if (bal < 81) {
            System.out.println(" Sizin baliniz B'dir ");
        } else if (bal <= 91) {
            System.out.println(" Sizin baliniz A'dir ");
        } else System.out.println("Balinizi duzgun daxil edin!");
    }
}
