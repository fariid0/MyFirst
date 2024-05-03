package src.Mentor.MentorTask16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ad soyad daxil edin: ");
        String text =sc.nextLine();
        System.out.println("Acar kod daxil edin: ");
        int key = sc.nextInt();


        String encryptedText = Sezar.encrypt(text,key);
        System.out.println("Encrypt text: " + encryptedText);

        String decrypted = Sezar.decrypt(encryptedText,key);
        System.out.println("Decrypted text: " + decrypted);

    }
}
