package src.Game;

import java.util.Scanner;

public class MiniGame1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A1 = {"A","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[] B2 = {"B","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[] C3 = {"C","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[] D4 = {"D","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[] E5 = {"E","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[] F6 = {"F","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[] G7 = {"G","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[] H8 = {"H","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[] X9 = {"X","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[] I10 = {"I","[ ]","[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[][] xerite1 = {A1, B2, C3, D4, E5, F6, G7, H8, X9, I10};

        for (String[] cedvel1 : xerite1) {
            for (String map1 : cedvel1) {
                System.out.print(map1 + " ");
            }
            System.out.println();
        }

        String[] A = {"[*]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[*]"};
        String[] B = {"[*]", "[ ]", "[ ]","[ ]", "[*]", "[ ]","[ ]", "[ ]", "[ ]", "[*]"};
        String[] C = {"[ ]", "[*]", "[*]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[*]"};
        String[] D = {"[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[] E = {"[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]","[*]", "[ ]", "[*]", "[ ]"};
        String[] F = {"[*]", "[*]", "[*]","[*]", "[ ]", "[ ]","[ ]", "[ ]", "[*]", "[ ]"};
        String[] G = {"[ ]", "[ ]", "[ ]","[ ]", "[ ]", "[*]","[ ]", "[ ]", "[*]", "[ ]"};
        String[] H = {"[ ]", "[*]", "[ ]","[ ]", "[ ]", "[*]","[ ]", "[ ]", "[*]", "[ ]"};
        String[] X = {"[ ]", "[ ]", "[ ]","[ ]", "[*]", "[ ]","[ ]", "[ ]", "[ ]", "[ ]"};
        String[] I = {"[ ]", "[*]", "[*]","[*]", "[ ]", "[ ]","[ ]", "[ ]", "[ ]", "[*]"};

        String[][] xerite = {A, B, C, D, E, F, G, H, X, I};



        for (int i = 0; i < 10; i++) {
            System.out.println("Vuracaginiz movqeyi secin ve sutun olaraq herf daxil edin: ");
            String herf = sc.next().toUpperCase(); //charnan olmadi
            System.out.println("Vuracaginiz movqeyi secin ve setr olaraq reqem daxil edin: ");
            int reqem = sc.nextInt() - 1;

            int setrIndex = herf.charAt(0) - 'A';
            if (setrIndex>= 0 && setrIndex < xerite.length && reqem >= 0 && reqem < xerite.length){
                if (xerite[setrIndex][reqem].equals("[*]")){
                    System.out.println("Tam hedefe!");
                    xerite[setrIndex][reqem] = "{X}";
                } else{ xerite[setrIndex][reqem] = "{X}";
                    System.out.println("Vura bilmediniz :(");}
            } else System.out.println("Duzgun kordinat daxil edin!");
        }

        for (String[] cedvel : xerite) {
            for (String map : cedvel) {
                System.out.print(map + " ");
            }
            System.out.println();
        }



    }
}

