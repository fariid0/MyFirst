package src.Mentor.MentorTask17;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nese yazin..");
        String input = sc.next();

        InputCategory category = InputValidator.categorizeInput(input);
        System.out.println(category.getValue());

        ////////      PART2

        System.out.println("Are you outgoing and sociable?");
        String answer1 = sc.next();

        System.out.println("Do you enjoy spending time alone?");
        String answer2 = sc.next();

        System.out.println("Are you comfortable in both social and solitary situations?");
        String answer3 = sc.next();

        if (answer1.equals("yes") && answer2.equals("yes") && answer3.equals("yes")){
            System.out.println(ChracterCategory.Omniverted);
        } else if (answer1.equals("no") && answer2.equals("no") && answer3.equals("no")) {
            System.out.println("Siz yoxsuz...");
        } else if (answer1.equals("yes") && answer2.equals("no") && answer3.equals("yes")) {
            System.out.println(ChracterCategory.Ambiverted);
        } else if (answer1.equals("no") && answer2.equals("yes") && answer3.equals("yes")) {
            System.out.println(ChracterCategory.Introverted);
        } else if (answer1.equals("yes") && answer2.equals("no") && answer3.equals("no")) {
            System.out.println(ChracterCategory.Extroverted);
        } else System.out.println("Are u sure? ");;

    }
}

//        System.out.println("Nese daxil edin: ");
//        String a = sc.next();
//
//        if (a.matches("[0-9]+")){
//            System.out.println("Yalniz eded daxil etmisiniz.");
//        } else if (a.matches("[a-zA-Z]+")) {
//            System.out.println("Yalniz herflerden ibaretdir.");
//        } else if (a.matches("[a-zA-Z\\p{Punct}]+")) {
//            System.out.println("$$$");
//        } else System.out.println("Qarisiqdir");