package src.Mentor;

import java.util.Scanner;

public class MentorTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vurma cedvelinden bir eded daxil edin: ");
        int vurma = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(vurma +" * " +i +" = " + i*vurma);
        }

        /* int cem = 0;
        for (int j = 0; j <= 10 ; j++) {
            if (j % 2 == 0) {
                continue;
                //System.out.println(cem += j);
            } else System.out.println(cem += j);
        }*/

        System.out.println("Eded daxil edin: ");
        int eded = sc.nextInt();
        int tekEdedlerinCemi = 0;

        while (eded > 0) {
            int reqem = eded % 10;
            if (reqem % 2 != 0) {
                tekEdedlerinCemi += reqem;
            }
            eded /= 10;
        }
        System.out.println(tekEdedlerinCemi);


    }
}
