package src.Lesson;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cergeA = {"77AB733", "77GT842", "02BL022", "77LJ980"};
        String[] cergeB = {"99VD886", "77EK430", "90ZX455", "90SZ551"};
        String[] cergeC = new String[4];

        System.out.println("Garaja gelen yeni masinlarin nomrelerini daxil edin: ");
        for (int i = 0; i < cergeC.length; i++) {
            cergeC[i] = sc.next();
        }

        String[][] garajSiyahi = {cergeA, cergeB, cergeC};

        System.out.println("Garajda olan masinlar: ");
        System.out.println(garajSiyahi[0]);
        System.out.println(garajSiyahi[1]);
        System.out.println(garajSiyahi[2]);

//        for (String[] cerge : garajSiyahi) {
//            for (String nomre : cerge) {
//                System.out.print(nomre + " ");
//            }
//            System.out.println();
//        }

    }
}
