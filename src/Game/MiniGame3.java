package src.Game;

import java.util.Scanner;

public class MiniGame3 {
    static int score = 0;
    static int round = 0;

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("SCORE : " + score);

        for (int i = round; i <= 3; i++) {
            round++;
            System.out.println("\n" + "Xerite(0) yoxsa Yazi(1)?" + "\n" + "Texmininizi daxil edin: ");
            int player = sc.nextInt();
            if (player == 0) {
                System.out.println("Sizin seciminiz: Xetite");
            } else if (player == 1) {
                System.out.println("Sizin seciminiz: Yazi");
            } else {
                System.out.println("Xais olunur Xerite(0) ve ya Yazi(1) daxil edin");
                playGame();
            }
            int random = (int) (Math.random() * 2);

            if (random == 0) {
                System.out.println("Qepik Xerite terefine dusdu...");
            } else System.out.println("Qepik Yazi terefine dusdu...");

            if (player == random) {
                System.out.println("Tebrikler duzgun texmin etdiniz.");
                score++;
            } else System.out.println("Yalnis texmin");
        }
        System.out.println("\n" + "Oyun bitdi sizin score'unuz: " + score);

    }
}
