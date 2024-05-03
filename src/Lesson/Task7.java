package src.Lesson;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        capEt(15,7, 'A', false);
        System.out.println();

        MethodTask7 masin = new MethodTask7("Bmw", "F30", 2015);
        MethodTask7 masin2 = new MethodTask7("Mecedes", "C-klass", 2016);

        masin.capEt();
        System.out.println();
        masin2.capEt();
        System.out.println();

        MethodTask7[] masinlar = {masin, masin2};

        ////////////TELEBE/////////////

        MethodTask7.telebe mezun = new MethodTask7.telebe("Ferid", "UNEC", 77);
        mezun.telebeCap();

    }
    static void capEt (int a, double b, char herf, boolean heYaYox){
        System.out.println(a);
        System.out.println(b);
        System.out.println(herf);
        System.out.println(heYaYox);
    }
}