package src.Dersde.MentorNickName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adinizi daxil edin: ");
        String name = sc.next();
        System.out.println("Soyadinizi daxil edin: ");
        String surname = sc.next();
        System.out.println("Yasinizi daxil edin: ");
        String age = sc.next();

        String nickName = name.concat(surname.concat(age));
        System.out.println(nickName);

        StringBuffer str = new StringBuffer();


    }
}
