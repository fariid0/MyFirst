package src.Game.QuizGameShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println();
        int point = 0;

        System.out.println("Sual 1");
        System.out.println("Radiusu " + Shape.r + " olan dairenin sahesini hesablayin.");
        int cavab1 = sc.nextInt();

        if(cavab1 == Shape.Circle()){
            point++;
            System.out.println("Dogrudur." + "\n" + point);
        } else System.out.println("Yalnis cavab." + "\n" + "Xaliniz = "+ point);

        System.out.println("Sual 2");

        System.out.println("Terefleri a = " + Shape.terefA + ", b = " + Shape.terefB + " olan duzbucaqlinin sahesini hesablayin");
        int cavab2 = sc.nextInt();

        if (cavab2 == Shape.Rectangle()){
            point++;
            System.out.println("Dogrudur." + "\n" + point);
        } else System.out.println("Yalnis cavab." + "\n" + "Xaliniz = "+ point);

        System.out.println("Sual 3");
        System.out.println("Katetleri a = " + Shape.a + " b = " + Shape.b + " olan duzbucaqli ucbucagin sahesini hesablayin");
        int cavab3 = sc.nextInt();

        if (cavab3 == Shape.Triangle()){
            point++;
            System.out.println("Dogrudur." + "\n" + point);
        } else System.out.println("Yalnis cavab." + "\n" + "Xaliniz = "+ point);
    }
}
