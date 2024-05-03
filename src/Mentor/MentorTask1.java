package src.Mentor;

import java.util.Scanner;

public class MentorTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gun daxil edin:");
        int gunSayi = sc.nextInt();

        int il = gunSayi/365;
        int qaliqGun = gunSayi % 365;
        int ay = qaliqGun/30;
        int hefte = (qaliqGun % 30) / 7;
        int gun = hefte % 7;
        System.out.println(gunSayi + "gun: " + il + "il," +ay +"ay," + hefte + "hefte," + gun + "gundur");
    }
}
