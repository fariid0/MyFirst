package src.Lesson;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        String rengler[] = {"Qirmizi", "Narinci", "Sari", "Yasil", "Mavi", "Goy", "Benovseyi"};
//        System.out.println(rengler[0]);


        int[] random = new int[10];
        for (int i = 1; i < random.length; i++) {
            random [i] = (int) (Math.random()*100);
            System.out.print(random[i]);
        }
        int max = 0;
        for (int r : random ) {
            if (r > max){
                max = r;
            }
            System.out.println(r);
        }
        System.out.println("En boyuk eded: " + max);


        String[] market = new String[10];


        market[0] = "Corek";
        market[1] = "Sud";
        market[2] = "Yumurta";
        market[3] = "Un";
        market[4] = "Kakao";
        market[5] = "Pendir";
        market[6] = "Makaron";

        for (int i = 0; i <= 6; i++) {
            System.out.println(market[i]);
        }

        System.out.println("Elave 3 erzaq daxil edin: ");
        market[7] = sc.next();
        market[8] = sc.next();
        market[9] = sc.next();






    }
}
