package src.Mentor.MentorTask14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your password: " + "\n");
        String password = sc.next();

        try {
            Password.validatePassword(password);
            System.out.println("Password is valid.");
        } catch (InvalidPasswordException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
