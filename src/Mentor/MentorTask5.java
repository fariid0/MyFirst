package src.Mentor;

import javax.management.modelmbean.ModelMBean;
import java.util.Scanner;

public class MentorTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//          TASK 1

        String[] masin = new String[10];
        System.out.println("Almaq istediyiniz masinin marka model ve ilini daxil edin: ");
        System.out.print("Marka: ");
        masin[0] = sc.next();
        System.out.print("Model: ");
        masin[1] = sc.next();
        System.out.print("Buraxilis ili: ");
        masin[2] = sc.next();

        System.out.println("Avtomobilin markasi: " +masin[0]);
        System.out.println("Modeli: " +masin[1]);
        System.out.println("Buraxilis ili: " +masin[2]);


//          TASK 2

        int[] ededler = new int[10];
        int kicik = 0;
        for (int i = 0; i < ededler.length; i++) {
            ededler[i] = (int) (Math.random()*100);
            //System.out.println(ededler[i]);
            kicik = ededler[0];
            if (kicik<ededler[i])
                System.out.println();
        }







    }
}
