package src.Mentor;

import java.util.Scanner;

public class MentorTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Yasinizi daxil edin: ");
        int yas = sc.nextInt();

        if (yas < 18) {
            System.out.println(yas + " Siz usagsiniz");
        } else if (yas < 35) {
            System.out.println(yas + " Siz cavansiniz");
        } else {
            System.out.println(yas + " Siz qocasiniz");
        }
    }
}
