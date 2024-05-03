package src.Lesson.Task15.Bank;

import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount person1 = new BankAccount(12345, "Inal", 100);
        BankAccount person2 = new BankAccount(4321, "Kenan", 200);

        System.out.println(person1);

        System.out.println("\n" + "Enter deposit amount: ");
        double deposit = sc.nextDouble();

        person1.depositAmount(deposit);
        System.out.println("\n" + person1);

        System.out.println( "Enter withdraw amount: ");
        double withdraw = sc.nextDouble();

        try {
            person1.withdrawAmount(withdraw);
        } catch (InsufficientResourcesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n" + person1);

        System.out.println();

        person2.transferFunds(person1, 70);

        System.out.println("\n" + person2);
    }
}
