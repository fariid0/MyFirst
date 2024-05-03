package src.Lesson;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cerge0 = {"[ ]", "[ ]", "[ ]"};
        String[] cerge1 = {"[ ]", "[ ]", "[ ]"};
        String[] cerge2 = {"[ ]", "[ ]", "[ ]"};

        String[][] xanalar = {cerge0, cerge1, cerge2};

        for (String[] yeni : xanalar){
            for (String cem : yeni){
                System.out.print(cem+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("Secdiyiniz setri daxil edin: ");
            int setr = sc.nextInt();

            System.out.println("Secdiyiniz sutunu daxil edin: ");
            int sutun = sc.nextInt();

            if (setr >= 0 && setr < xanalar.length && sutun >= 0 && sutun < xanalar.length){
                System.out.println("Simvolunuzu daxil edin!");
                System.out.println("Qeyd: Simvol X ve ya O olmalidir: ");
                String simvol = sc.next();
                xanalar[setr][sutun] = simvol;

//                if (simvol == "X" || simvol == "O"){
//                }else System.out.println("Duzgun daxil edin");

            } else System.out.println("0-2 arasinda setr ve sutun daxil edin");

            for (String[] yeni : xanalar){
                for (String cem : yeni){
                    System.out.print(cem+ " ");
                }
                System.out.println();
            }
        }





    }
}