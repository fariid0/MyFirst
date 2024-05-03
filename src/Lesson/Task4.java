package src.Lesson;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        /* int eded = 1;
        int cem = 0;

        while (eded <= 100){
            if (eded % 2 == 0) {
                cem += eded;
            }
            eded ++;
        }
        System.out.println(cem); */


        ////////////////////////////////////


        /*int a = 7;
        do {
            System.out.println("eded: " + a);
            a++;
        } while (a < 15); */


        ////////////////////////////////////


        /* for (int j = 0; j < 23; j++) {
            if (j % 3 == 0)
                continue;
            System.out.println(j);*/


            ////////////////////////////////////
            //  FIBONACCI

            int ilkeded = 0, ikincieded = 1;
        System.out.print(ilkeded + " " + ikincieded + " ");

            for (int i = 2; i <= 10; i++) {
            int next = ilkeded + ikincieded;
                System.out.print(next + " ");
            ilkeded = ikincieded;
            ikincieded = next;
            }





//            Math.random();
//            int playerScore = 0;
//            int computerScore = 0;
//
//            do {
//                System.out.println("Das (1), Kagiz (2), Qayci(3)");
//                int playerSecimi = sc.nextInt();
//
//                if (playerSecimi < 1 || playerSecimi > 3) {
//                    System.out.println("Xais olunur 1-3 arasinda bir secim daxil edin!");
//                    continue;
//                }
//                int computerSecimi = random.nextInt (3) +1;
//                System.out.println("Komputer secimi: " + computerSecimi);
//
//                if ((playerSecimi == 1 && computerSecimi == 2) ||
//                        (playerSecimi == 2 && computerSecimi == 1) ||
//                        (playerSecimi == 3 && computerSecimi == 2)){
//                    System.out.println("Tebrikler siz qazandiniz!!!");
//                    playerScore++;
//
//                } else if (playerSecimi == computerSecimi) {
//                    System.out.println("Berabere");
//                } else System.out.println("Tesufki uduzdunuz :(");
//                computerScore ++;
//                System.out.println("Computer skoru: " + computerScore + "Sizin skorunuz" + playerScore);
//
//            }

        }
    }
//}
