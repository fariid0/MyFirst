package src.Mentor.MentorTask8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Icki ickiler = new Icki("Cola", 2.5,"Sirab", 3,"Naturalni",4);
        Meze mezeler = new Meze("Stalicni", 4.5, "Mangal salati", 5.5, "pendir", 3);
        Kabab kabablar = new Kabab("Tike", 7.0, "Lule", 8,"Basdirma", 10);

        Menu menu1 = new Menu(kabablar,mezeler,ickiler);
        System.out.println(menu1);

        System.out.println("\n"+"Secdiyiniz mehsullari daxil edin: ");
        String secilen = sc.next();
        double a = 0;

        if (secilen == kabablar.name1){
            System.out.println(a + kabablar.price1);
        }
        System.out.println(a);

    }
}
