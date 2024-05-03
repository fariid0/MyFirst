package src.Game;

import java.util.Scanner;

public class MiniGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sual1 = "Sual 1. Mercedes markali avtomobilin yaradicisi Karl Benz Mercedes adini kimden goturmusdur? ";
        System.out.println(sual1);
        MiniGame2Method cavab1 = new MiniGame2Method("Qizindan","Yoldasindan","Anasindan","Nenesinden");
        cavab1.capEt();

        System.out.println("Duzgun cavabi daxil edin: ");
        String user1 = sc.next();

        if(user1.equals(cavab1.A)){
            System.out.println("Dogru cavab");
        }else System.out.println("Yalnisdir");

        String sual2 = "Sual 2. Hansi daha dozumludur?";
        System.out.println(sual2);
        MiniGame2Method cavab2 = new MiniGame2Method("Mercedes", "Bmw", "Toyota","Audi");
        cavab2.capEt();

        System.out.println("Duzgun cavabi daxil edin: ");
        String user2 = sc.next();

        if(user2.equalsIgnoreCase(cavab2.C)){
            System.out.println("Dogru cavab");
        }else System.out.println("Yalnisdir");

        String sual3 = "Sual 3. Ilk buraxilis tarixinde teyyare muherriki istehsal eden marka";
        System.out.println(sual3);
        MiniGame2Method cavab3 = new MiniGame2Method("Bentley", "Mercedes","Ford", "Bmw");
        cavab3.capEt();

        System.out.println("Duzgun cavabi daxil edin: ");
        String user3 = sc.next();

        if (user3.equalsIgnoreCase(cavab3.D)){
            System.out.println("Dogru cavab");
        } else System.out.println("Yalnisdir");
    }
}
