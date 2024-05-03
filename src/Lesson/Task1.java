package src.Lesson;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        int num1 = 8;
//        int num2 = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("a'ni daxil edin");
            int a = sc.nextInt();
        System.out.println("b'ni daxil edin");
            int b = sc.nextInt();
            int topla = a+b;
            int cix = a-b;
            double bol = a/b;
            int vurma = a*b;
        System.out.println("Cavab"+bol);

        int x = 5;
        int y = 10;

        boolean ferqlidirmi = x != y;
        boolean beraberdimi = x == y;

        System.out.println(ferqlidirmi);
    }
}
