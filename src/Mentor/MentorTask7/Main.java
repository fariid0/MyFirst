package src.Mentor.MentorTask7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //new MTask7Method.heyvanlar("Mestan", 1, "Pisik");

        //new MTask7Method("salam", 1, "pisik");
        Pet heyvan1 = new Pet("Mestan", 2, "pisik" );
        System.out.println(heyvan1);

        if (heyvan1.novu /*equalsIgnoreCase()*/ == "pisik" || heyvan1.novu == "cat"){
            System.out.println("Meow!");
        } else if (heyvan1.novu == "it" || heyvan1.novu == "dog") {
            System.out.println("Woof!");
        } else System.out.println("I am a " + heyvan1.novu );

    }
}
