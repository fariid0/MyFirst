package src.Lesson;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // command + option+ (shift) + l
        // ctrl + alt + (shift) + l


        int a = 10;
        int b = 17;
            boolean boyukdurmu = b>10;
            boolean kicikdirmi = b<10;
            boolean beraberdir = b==10;

        //System.out.println(boyukdurmu);

//        if (boyukdurmu) {
//            System.out.println("edediniz 10'dan boyukdur:"+b);
//        }
//        else if (beraberdir) {
//            System.out.println("edediniz 10'a beraberdir");
//        }
//        else  {
//            System.out.println("edediniz 10'dan kicikdir"+b);
//        }
//        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin:");
        int eded = sc.nextInt();

        if (eded % 2 == 0){
            System.out.println("Cut ededdir");
        } else {
            System.out.println("Tek ededdir");
        }
        System.out.println("Kesr eded daxil edin:");
            double x = sc.nextDouble();
        System.out.println("Tam eded daxil edin:");
            int y = sc.nextInt();
            double cem = x+y;
        System.out.println("Cemi:"+ cem);

        int random = (int) (Math.random() *50);
            System.out.println(random);
        if (random>20){
            System.out.println("Eded 20'den boyukdur");
        } else {
            System.out.println("Eded 20'den kicikdir");
        }

        System.out.println("1-10 Reqem daxil et");
            int number = sc.nextInt();
            int numberrandom = (int) (Math.random() *10);
        System.out.println(numberrandom);
        if (number == numberrandom)   {
            System.out.println("Tebrikler duzgun texmin!");
        } else if (number > numberrandom) {
            System.out.println("Yuksek dediniz");
        } else if (number < numberrandom) {
            System.out.println("Kicik dediniz");
        }
    }

}
