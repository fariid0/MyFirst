package src.Mentor;

import java.util.Scanner;

public class MentorTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ay daxil edin: ");
        int ay = sc.nextInt();

        while (1 > ay || ay > 12){
            System.out.println("Bele bir ay yoxdur, zehmet olmasa duzgun daxil edin!");
            System.out.println("Ay daxil edin: ");
            ay = sc.nextInt();
        }


        switch (ay) {
            case 1:
                System.out.println("Yanvar");
                break;
            case 2:
                System.out.println("Fevral");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Aprel");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Iyun");
                break;
            case 7:
                System.out.println("Iyul");
                break;
            case 8:
                System.out.println("Avqust");
                break;
            case 9:
                System.out.println("Sentyabr");
                break;
            case 10:
                System.out.println("Oktyabr");
                break;
            case 11:
                System.out.println("Noyabr");
                break;
            case 12:
                System.out.println("Dekabr");
            //default:
                //System.out.println("Bele bir ay yoxdur, zehmet olmasa duzgun daxil edin!");
        }


        System.out.println("A ededini daxil edin: ");
            int a = sc.nextInt();

        System.out.println("B ededini daxil edin: ");
            int b = sc.nextInt();

            if (a > b) {
                System.out.println("Daxil etdiyiniz A ededi B ededinden boyukdur!");
            } else if (a < b) {
                System.out.println("Daxil etdiyiniz B ededi A ededinden boyukdur!");
            } else System.out.println("Daxil etdiyiniz ededler beraberdir");
    }
}
