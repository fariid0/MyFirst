package src.Lesson.Task10;

public class BankAccount {
    public static void main(String[] args) {

        BankMethod admin1 = new BankMethod("Farid", "ABB",277.5, "Manat");
        BankMethod admin2 = new BankMethod("Kamran", "Kapital",437.2,"Dollar");
        BankMethod admin3 = new BankMethod("Elmir", "Unibank",800,"Euro");

        int cem = BankMethod.totalAccounts;
        System.out.println(cem);

    }
}
